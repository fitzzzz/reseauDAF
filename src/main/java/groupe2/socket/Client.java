package groupe2.socket;

import common.Code;
import common.Idea;
import common.Request;
import common.Response;
import groupe2.serialisation.DeserializeResponse;
import groupe2.serialisation.SerializeRequest;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import static common.Code.ADD_IDEA;
import static common.Code.GET_IDEA;

/**
 * @author François Melkonian
 */
public class Client {
	private final Socket connection;
	private String req;
	public Client(Code code) throws IOException {
	 connection = new Socket("127.0.0.1" ,1234);
	 req=code.name();
 }
 public void start() throws IOException {
	 Idea i = new Idea("desc","etudiant","mail@g.com");
	 List<Object> liste = new ArrayList<>();
	 liste.add(i);
	 Request request = new Request(req, liste);
	 ObjectOutputStream stream = new ObjectOutputStream(connection.getOutputStream());
	 SerializeRequest.run(stream,request);
	 ObjectInputStream data = new ObjectInputStream(connection.getInputStream());
	 Response r= DeserializeResponse.run(data);
	 System.out.println(r.getResponses());

 }


	public static void main(String[] args) throws IOException {

		Client c = null;
		try {
			c = new Client(ADD_IDEA);
		} catch (IOException e) {
			System.err.println("Le serveur est injoignable");
			System.exit(1);
		}

		c.start();
		Client d = null;
		try {
			d = new Client(GET_IDEA);
		} catch (IOException e) {
			System.err.println("Le serveur est injoignable");
			System.exit(1);
		}

		d.start();
	}
}
