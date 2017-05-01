package groupe2.socket;

import common.Requete;
import common.Response;
import groupe2.serialisation.DeserializeRequest;
import groupe2.serialisation.SerializeResponse;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author François Melkonian
 */
public class Server {
	private ServerSocket serverSocket;
	private Socket client;
	public Server() throws IOException {
		serverSocket = new ServerSocket(1234);
		client = serverSocket.accept();

	}
	public Requete decode() throws IOException {

		DataInputStream input = new DataInputStream(client.getInputStream());
		ObjectInputStream stream =  new ObjectInputStream(input);
		Requete req =  DeserializeRequest.run(stream);
		input.close();
		return req;
	}

	public void sendResponse(Response rep,boolean lastCommand) throws IOException {
		DataOutputStream output = new DataOutputStream(client.getOutputStream());
		ObjectOutputStream stream = new ObjectOutputStream(output);
		SerializeResponse.run(stream, rep);
		stream.close();
		if(lastCommand){
			client.close();
		}
	}
	public void close() throws IOException {
		serverSocket.close();
	}
}
