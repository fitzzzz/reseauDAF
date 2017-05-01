package groupe1.client.requestHandler;

import java.util.HashMap;
import java.util.Map;

import static common.Code.*;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class RequestHandlerMap {

    private static final Map<String, RequestHandler> requestHandlerMap = new HashMap<>();

    static {
        requestHandlerMap.put(ADD_IDEA.name(),new AddIdeaHandler());
        requestHandlerMap.put(GET_IDEA.name(),new GetIdeaPackage());
        requestHandlerMap.put(GET_PARTICIPANT.name(),new GetParticipantHandler());
        requestHandlerMap.put(PARTICIPATE.name(),new ParticipateHandler());
    }

}
