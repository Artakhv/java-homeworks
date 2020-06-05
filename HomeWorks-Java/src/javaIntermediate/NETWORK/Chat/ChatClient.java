package javaIntermediate.NETWORK.Chat;

import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.io.*;

class ChatClient {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws UnknownHostException, IOException {
//
        Socket s = new Socket("localhost", 32456);
        System.out.println("Connected");
        // InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();
        boolean running = true;
        String command;
        while(running) {
            command = bufferedReader.readLine();
            switch(command.toLowerCase()) {
                case "r":
                    byte opcode = 1;
                    os.write(1);
                    os.write(opcode);
                    os.flush();
                    System.out.println("Print your mail");

                    String mail = bufferedReader.readLine();
                    byte[] mailBytes = mail.getBytes();
                    int mailBytesLength = ByteBuffer.wrap(mailBytes).getInt();
                    os.write(mailBytesLength);
                    os.write(mailBytes);
                    os.flush();

                    System.out.println("Print your name");
                    String name = bufferedReader.readLine();
                    byte[] nameBytes = name.getBytes();
                    int nameBytesLength = ByteBuffer.wrap(nameBytes).getInt();
                    os.write(nameBytesLength);
                    os.write(nameBytes);
                    os.flush();

                    System.out.println("Print your password");
                    String password = bufferedReader.readLine();
                    byte[] passwordBytes = password.getBytes();
                    int passwordBytesLength = ByteBuffer.wrap(passwordBytes).getInt();
                    os.write(passwordBytesLength);
                    os.write(passwordBytes);
                    os.flush();
                    os.close();

                    break;
                case "s":
                    System.out.println("Print your name");
                    System.out.println("Print your password");
                    break;
                case "q":
                    running = false;
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}