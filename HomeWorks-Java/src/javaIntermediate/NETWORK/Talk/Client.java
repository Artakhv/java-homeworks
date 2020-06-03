package javaIntermediate.NETWORK.Talk;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private static Socket clientSocket;
    private static BufferedReader readerFromConsole; // read from console

    private static BufferedReader in ; // read from socket
    private static BufferedWriter out; // write in socket

    public static void main(String[] args) throws IOException {
        try {
            clientSocket = new Socket("localhost",4004);
            readerFromConsole = new BufferedReader(new InputStreamReader(System.in));
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            System.out.println("Are you wanna type something?:");
            String text = readerFromConsole.readLine();
            out.write(text+"\n");
            out.flush();
            String serverResponse = in.readLine();
            System.out.println(serverResponse);
        } catch (UnknownHostException e) {
            e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
            e.getMessage();
        }
        finally {
            System.out.println("Client disconnected!!!");
            clientSocket.close();
            in.close();
            out.close();
        }
    }
}
