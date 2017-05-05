package groupe1.server.requesthandler;

import common.Request;

import java.net.Socket;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public abstract class RequestHandler {
    public abstract void answer(Socket client, Request requete);
}
