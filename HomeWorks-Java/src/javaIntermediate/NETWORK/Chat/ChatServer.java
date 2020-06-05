package javaIntermediate.NETWORK.Chat;

import java.io.*;
import java.net.*;
import java.util.*;


public class ChatServer {
    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        int port = 32456;
        ServerSocket ss = new ServerSocket(port);
        System.out.println("Server started on port: " + port);
        while (true) {
            Socket s = ss.accept();
            System.out.println("Client connected: " + s);
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        process(s);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }

    private static void process(Socket s) throws Exception {
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();
        int code = is.read();
        OpCode opCode = OpCode.values()[code - 1];
        System.out.println("Op code: " + opCode);
        switch (opCode) {
            case Register:
                registerUser(is, os);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    private static void registerUser(InputStream is, OutputStream os) throws Exception {
        String name = readString(is);
        String email = readString(is);
        String password = readString(is);
        User user = new User(name, email, password);
        users.add(user);
        System.out.println("[Name: " + name + ", " + "Email: " + email + ", " + "Password: " + password + "]");
    }

    private static String readString(InputStream is) throws Exception {
        int length = is.read();
        if (length == -1) throw new IllegalArgumentException();
        byte[] buffer = new byte[length];
        is.read(buffer);
        return new String(buffer);
    }
}

enum OpCode {
    Register,
    SignIn
}

class User {
    String name;
    String email;
    String password;

    User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}