package groupe1.server;

import common.Requete;
import groupe1.common.communication.SenderReceiver;
import groupe1.server.requesthandler.RequestHandler;
import groupe1.server.requesthandler.RequestHandlerMap;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket clientSocket = serverSocket.accept();
        Map<String, RequestHandler> requestHandlerMap = RequestHandlerMap.getRequestHandlerMap();

        Requete requete = (Requete) SenderReceiver.receive(clientSocket);
        requestHandlerMap.get(requete.getCode()).answer(clientSocket, requete);
        serverSocket.close();
        clientSocket.close();
    }
}
