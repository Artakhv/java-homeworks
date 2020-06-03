package javaIntermediate.NETWORK.Talk;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static Socket clientSocket;
    private static ServerSocket server;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) {
        try {
            try {
                server = new ServerSocket(4004);
                System.out.println("Server connected");
                clientSocket = server.accept();
                try {
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

                    String word = in.readLine();
                    System.out.println(word);
                    out.write("Hello from the server !!! You write: " + word);
                    out.flush();
                }
                finally {
                    clientSocket.close();
                    in.close();
                    out.close();
                }
            }
            finally {
                System.out.println("Server disconnected");
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
