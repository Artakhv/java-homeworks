package javaIntermediate.NETWORK.Talk;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static Socket clientSocket;
    private static ServerSocket server;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) {
        try {
            server = new ServerSocket(4000);
            System.out.println("Server connected");

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
