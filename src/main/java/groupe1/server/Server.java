package groupe1.server;

import common.Request;
import groupe1.common.communication.SenderReceiver;
import groupe1.server.requesthandler.RequestHandler;
import groupe1.server.requesthandler.RequestHandlerMap;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket clientSocket = serverSocket.accept();
        Scanner scanner = new Scanner(System.in);
        Map<String, RequestHandler> requestHandlerMap = RequestHandlerMap.getRequestHandlerMap();

        while (scanner.nextInt() != 0) {
            Request requete = (Request) SenderReceiver.receive(clientSocket);
            requestHandlerMap.get(requete.getCode()).answer(clientSocket, requete);
        }
        serverSocket.close();
        clientSocket.close();
    }
}
