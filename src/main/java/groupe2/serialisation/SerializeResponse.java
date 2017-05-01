package groupe2.serialisation;

import common.Requete;
import common.Response;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.IllegalFormatException;

/**
 * @author François Melkonian
 */
public class SerializeResponse {

	public static void run(ObjectOutputStream stream, Response rep) {
		try {
			stream.writeObject(rep);
			stream.close();
		} catch (IOException e) {
			throw new IllegalStateException("La réponse du serveur est invalide : "+rep.getResponses(),e);
		}
	}
}
