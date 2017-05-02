package groupe2.socket;

import common.Requete;
import common.Response;
import groupe2.protocol.MyProtocol;
import groupe2.serialisation.DeserializeRequest;
import groupe2.serialisation.SerializeResponse;

import java.io.*;
import java.net.Socket;

/**
 * @author François Melkonian
 */
public class ServerThread extends Thread {
	private Socket socket;
	private MyProtocol protocol;
	public ServerThread(Socket socket, MyProtocol protocol){
		super("ServerThread");
		this.protocol = protocol;
		this.socket = socket;
	}

	public Requete decode() throws IOException {

		DataInputStream input = new DataInputStream(socket.getInputStream());
		ObjectInputStream stream =  new ObjectInputStream(input);
		Requete req =  DeserializeRequest.run(stream);
		return req;
	}
	@Override
	public void run() {

		Requete requete = null;
		try {
			requete = decode();
			Response rep = protocol.respond(requete);
			System.out.println("envoye :"+rep);
			sendResponse(rep,true);

		} catch (IOException e) {
			e.printStackTrace();
		}
		}

	public void sendResponse(Response rep,boolean lastCommand) throws IOException {
		DataOutputStream output = new DataOutputStream(socket.getOutputStream());
		ObjectOutputStream stream = new ObjectOutputStream(output);
		SerializeResponse.run(stream, rep);
		if(lastCommand){
			//socket.close();
		}
	}
}
