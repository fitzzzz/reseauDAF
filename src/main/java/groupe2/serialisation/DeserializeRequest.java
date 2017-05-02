package groupe2.serialisation;

import common.Idea;
import common.Requete;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.IllegalFormatException;

/**
 * @author François Melkonian
 */
public class DeserializeRequest {
	public static Requete run(ObjectInputStream stream) throws IllegalFormatException {
		try {
			Requete requete = (Requete) stream.readObject();
			return requete;
		}catch (Exception e){
			throw new IllegalStateException("Le client n'est pas compatible avec le serveur",e);
		}
	}
}
