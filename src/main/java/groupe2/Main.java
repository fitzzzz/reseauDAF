package groupe2;

import groupe2.socket.Server;

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