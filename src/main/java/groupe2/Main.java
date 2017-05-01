package groupe2;

import common.Idea;
import common.Requete;
import common.Response;
import groupe2.protocol.MyProtocol;
import groupe2.serialisation.DeserializeRequest;
import groupe2.socket.Client;
import groupe2.socket.Server;

import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * @author François Melkonian
 */
public class Main {
	public static void main(String[] args) throws Exception {
					runServer();
	}
	private static void runServer() throws Exception{
		MyProtocol protocol = new MyProtocol();
		Server server = new Server();
		Requete requete = server.decode();
		Response rep = protocol.respond(requete);
		System.out.println(protocol.show());
		server.sendResponse(rep,true);
		server.close();
		protocol.toString();
	}
}
// TODO : 1 seule séance ( 2 mai ) pour ecrire serveur/client et tester, et avoir un protocole validé