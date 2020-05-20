package javaIntermediate.EXERCISES3;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class Main {
    private static final int BOARD_WIDTH = 10;
    private static final int BOARD_HEIGHT = 10;
    private static final Point[] points = new Point[BOARD_WIDTH * BOARD_HEIGHT];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        boolean running = true;
        while (running) {
            System.out.println("Please choose a command");
            System.out.println("(P) Create new point");
            System.out.println("(E) Export the image");
            System.out.println("(Q) Exit the application");
            String command = scanner.nextLine();
            if ("P".equalsIgnoreCase(command)) {
                createNewPoint();
            } else if ("E".equalsIgnoreCase(command)) {
                exportImage();
            } else if ("Q".equalsIgnoreCase(command)) {
                running = false;
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    public static void createNewPoint() {
        System.out.print("x: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("y: ");
        int y = Integer.parseInt(scanner.nextLine());
        int index = x * BOARD_WIDTH + y;
        if (points[index] == null) {
            points[index] = new Point(x, y);
        }
        System.out.println("----------- Point added -----------");
    }

    public static void exportImage() throws Exception {
        int[][] board = new int[BOARD_WIDTH][BOARD_HEIGHT];
        for (int i = 0; i < BOARD_WIDTH; i++) {
            for (int j = 0; j < BOARD_HEIGHT; j++) {
                int pointIndex = i * BOARD_WIDTH + j;
                if (points[pointIndex] != null) {
                    board[i][j] = 1;
                }
            }
        }
        File file = new File("D:\\Output\\image.pbm");
        PrintWriter writer = new PrintWriter(file);
        writer.println("P1");
        writer.println(BOARD_WIDTH + " " + BOARD_HEIGHT);
        for (int i = 0; i < BOARD_WIDTH; i++) {
            for (int j = 0; j < BOARD_HEIGHT; j++) {
                writer.print(board[i][j]);
                writer.print(" ");
            }
            writer.println();
        }
        writer.close();
    }
}
