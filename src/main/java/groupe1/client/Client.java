package groupe1.client;

import common.Idea;
import groupe1.common.communication.SenderReceiver;
import groupe1.common.requete.GetIdeaRequest;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket serverSocket = new Socket("127.0.0.1", 6666);
        SenderReceiver.send(serverSocket, new GetIdeaRequest());
        serverSocket.close();
    }
}
