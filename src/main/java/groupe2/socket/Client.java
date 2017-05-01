package groupe2.socket;

import common.Idea;
import common.Requete;
import common.Response;
import groupe2.serialisation.DeserializeRequest;
import groupe2.serialisation.DeserializeResponse;
import groupe2.serialisation.SerializeRequest;
import groupe2.serialisation.SerializeResponse;

import java.io.*;
import java.net.Inet4Address;
import java.net.Socket;
import java.util.Collections;

/**
 * @author François Melkonian
 */
public class Client {
	private final Socket connection;

	public Client() throws IOException {
	 connection = new Socket("127.0.0.1" ,1234);
 }
 public void start() throws IOException {
	 Idea i = new Idea("desc","etudiant","mail@g.com");
	 Requete requete = new Requete("add", Collections.singletonList(i));
	 ObjectOutputStream stream = new ObjectOutputStream(connection.getOutputStream());
	 SerializeRequest.run(stream,requete);
	 ObjectInputStream data = new ObjectInputStream(connection.getInputStream());
	 while (data.available()<1){
	 }
	 Response r= DeserializeResponse.run(data);
	 data.close();


 }


	public static void main(String[] args) throws IOException {

		Client c = null;
		try {
			c = new Client();
		} catch (IOException e) {
			System.err.println("Le serveur est injoignable");
			System.exit(1);
		}

		c.start();
	}
}
