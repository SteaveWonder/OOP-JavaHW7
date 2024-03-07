package view;

import model.Calculator;

import java.util.Scanner;

public class ConsoleInputReader implements InputReader {
    private Scanner scanner;
    public ConsoleInputReader() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String readInput(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    @Override
    public double readDouble(String message) {
        System.out.println(message);
        return Double.parseDouble(scanner.nextLine());
    }
}
