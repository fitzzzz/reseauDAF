package groupe2.serialisation;

import common.Requete;
import common.Response;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author François Melkonian
 */
public class SerializeRequest {

	public static void run(ObjectOutputStream stream, Requete rep) {
		try {
			stream.writeObject(rep);
		} catch (IOException e) {
			throw new IllegalStateException("La réponse du serveur est invalide : "+rep.getParams(),e);
		}
	}
}
