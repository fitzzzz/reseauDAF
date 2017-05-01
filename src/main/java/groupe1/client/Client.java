package groupe1.client;

import common.Requete;
import common.Response;
import groupe1.common.communication.SenderReceiver;
import groupe1.common.requete.GetIdeaRequest;
import groupe1.client.requestHandler.RequestHandler;
import groupe1.client.requestHandler.RequestHandlerMap;

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

        while (scanner.nextInt() != 0) {
            Requete requete = new GetIdeaRequest();
            SenderReceiver.send(serverSocket, requete);
            Response response = (Response)SenderReceiver.receive(serverSocket);
            requestHandlerMap.get(requete.getCode()).handleResponse(response);
        }
        serverSocket.close();
    }
}
