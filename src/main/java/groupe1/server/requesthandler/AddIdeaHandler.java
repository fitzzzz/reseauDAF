package groupe1.server.requesthandler;

import common.Idea;
import common.Request;
import groupe1.common.IdeaModel;
import groupe1.common.communication.SenderReceiver;
import groupe1.common.response.AddIdeaResponse;

import java.net.Socket;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class AddIdeaHandler extends RequestHandler {
    @Override
    public void answer(Socket client, Request requete) {
        SenderReceiver.send(client, new AddIdeaResponse(IdeaModel.getInstance().add((Idea) requete.getParams().get(0))));
        System.out.println("Idée bien ajoutée !!");
    }
}
