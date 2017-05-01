package groupe1.server;

import common.Requete;
import groupe1.server.requesthandler.RequestHandler;
import groupe1.server.requesthandler.RequestHandlerMap;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(5555);
        Socket clientSocket = serverSocket.accept();
        ObjectInputStream objectInputStream = new ObjectInputStream(clientSocket.getInputStream());
        Requete requete = (Requete) objectInputStream.readObject();
        Map<String, RequestHandler> requestHandlerMap = RequestHandlerMap.getRequestHandlerMap();
        requestHandlerMap.get(requete.getCode()).answer();
    }
}
