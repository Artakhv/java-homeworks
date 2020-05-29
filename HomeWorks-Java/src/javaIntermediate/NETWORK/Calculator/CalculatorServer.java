package javaIntermediate.NETWORK.Calculator;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class CalculatorServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(30123);
        while(true) {
            Socket client = ss.accept(); // BLOCKING
            System.out.println("Client connected: " + client);

            InputStream is = client.getInputStream(); //We read from here
            OutputStream os = client.getOutputStream(); //We write here

            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            PrintWriter writer = new PrintWriter(os, true);

            String firstNumber = reader.readLine(); // READ LINE  // BLOCKING
            System.out.println(firstNumber);

            String secondNumber = reader.readLine(); // READ LINE  // BLOCKING
            System.out.println(secondNumber);

            int result = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
            writer.println(result); // WRITE LINE
        }
    }
}


//Socket s = new Socket("192.168.0.1", 6666);
//ServerSocket ss = new ServerSocket(6666);