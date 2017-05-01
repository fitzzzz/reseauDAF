package groupe1.client.requestHandler;

import common.Response;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class AddIdeaHandler extends RequestHandler{
    @Override
    public void handleResponse(Response response) {
        System.out.println("Idée bien ajoutée, son id est le " + response.getResponses().get(0));
    }
}
