package groupe1.client;

import common.Requete;
import common.Response;
import groupe1.client.requestHandler.RequestHandler;
import groupe1.client.requestHandler.RequestHandlerMap;
import groupe1.common.communication.SenderReceiver;
import groupe1.common.requete.AddIdea;
import groupe1.common.requete.GetIdeaRequest;

import java.io.IOException;
import java.net.Socket;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket serverSocket = new Socket("127.0.0.1", 6666);
        Scanner scanner = new Scanner(System.in);
        Map<String, RequestHandler> requestHandlerMap = RequestHandlerMap.getRequestHandlerMap();
        int nbPassage = 0;
        Requete requete;
        while (scanner.nextInt() != 0) {

            ////////////////////////////////////////////

            if (nbPassage%2 == 0) {
                requete = new AddIdea();
            }else {
                requete = new GetIdeaRequest();         ///Alternate AddIdea and GetIdea request.
            }
            nbPassage++;

            ///////////////////////////////////////////

            SenderReceiver.send(serverSocket, requete);
            Response response = (Response) SenderReceiver.receive(serverSocket);
            requestHandlerMap.get(requete.getCode()).handleResponse(response);
        }
        serverSocket.close();
    }
}
