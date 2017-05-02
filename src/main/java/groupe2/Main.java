package groupe2;

import common.Idea;
import common.Requete;
import common.Response;
import groupe2.protocol.MyProtocol;
import groupe2.serialisation.DeserializeRequest;
import groupe2.socket.Client;
import groupe2.socket.Server;
import groupe2.socket.ServerThread;

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
		Server server = new Server();
		while (true){
			server.run();
		}
	}
}
// TODO : 1 seule séance ( 2 mai ) pour ecrire serveur/client et tester, et avoir un protocole validé