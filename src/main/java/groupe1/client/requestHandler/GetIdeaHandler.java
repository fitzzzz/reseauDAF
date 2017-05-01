package groupe1.client.requestHandler;

import common.Idea;
import common.Response;
import groupe1.common.response.GetIdeaResponse;

import java.util.List;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class GetIdeaHandler extends RequestHandler {

    @Override
    public void handleResponse(Response response) {
        List<Idea> ideaList = (List<Idea>) response.getResponses().get(0);
        if (!ideaList.isEmpty()) {
            for (Idea idea: ideaList) {
                System.out.println(idea);
            }
        } else {
            System.out.println("Aucune idée pour le moment");
        }

    }
}
