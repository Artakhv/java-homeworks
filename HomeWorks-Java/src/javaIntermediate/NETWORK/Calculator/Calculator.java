package javaIntermediate.NETWORK.Calculator;

import java.util.Scanner;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket(args[0], Integer.parseInt(args[1])); // BLOCKING
//        Socket s = new Socket("192.168.y.y", 3000);
        System.out.println("Connected to the server");

        InputStream is = s.getInputStream(); //We read from here
        OutputStream os = s.getOutputStream(); //We write here

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        PrintWriter writer = new PrintWriter(os, true);

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        String a = scanner.nextLine();    // WRITE LINE
        writer.println(a);

        System.out.print("b: ");
        String b = scanner.nextLine(); // WRITE LINE
        writer.println(b);

        String result = reader.readLine(); // READ LINE // BLOCKING
        System.out.println(a + " + " + b + " = " + result);
    }
}