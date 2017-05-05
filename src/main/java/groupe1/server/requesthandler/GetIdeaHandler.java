package groupe1.server.requesthandler;

import common.Request;
import groupe1.common.IdeaModel;
import groupe1.common.communication.SenderReceiver;
import groupe1.common.response.GetIdeaResponse;

import java.net.Socket;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class GetIdeaHandler extends RequestHandler {
    @Override
    public void answer(Socket client, Request requete) {
        SenderReceiver.send(client, new GetIdeaResponse(IdeaModel.getInstance().getIdeas()));
        System.out.println("GetIdea !!");
    }
}
