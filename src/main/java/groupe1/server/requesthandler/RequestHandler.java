package groupe1.server.requesthandler;

import common.Requete;

import java.net.Socket;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public abstract class RequestHandler {
    public abstract void answer(Socket client, Requete requete);
}
