package view;

import model.Calculable;
import model.ICalculableFactory;

public class ViewCalculator {
    private ICalculableFactory calculableFactory;
    private InputReader inputReader;
    private OutputWriter outputWriter;

    public ViewCalculator(ICalculableFactory calculableFactory, InputReader inputReader, OutputWriter outputWriter) {
        this.calculableFactory = calculableFactory;
        this.inputReader = inputReader;
        this.outputWriter = outputWriter;
    }

    public void run() {
        while (true) {
            double mainArg = inputReader.readDouble("Input number: ");
            Calculable calculator = calculableFactory.create(mainArg);
            while (true) {
                String mats = inputReader.readInput("Input (+, -, *, /, =) : ");
                if (mats.equals("+")) {
                    double arg = inputReader.readDouble("Input next number: ");
                    calculator.sum(arg);
                    continue;
                }
                if (mats.equals("-")) {
                    double arg = inputReader.readDouble("Input next number: ");
                    calculator.difference(arg);
                    continue;
                }
                if (mats.equals("*")) {
                    double arg = inputReader.readDouble("Input next number: ");
                    calculator.multiplication(arg);
                    continue;
                }
                if (mats.equals("/")) {
                    double arg = inputReader.readDouble("Input next number: ");
                    calculator.division(arg);
                    continue;
                }
                if (mats.equals("=")) {
                    double result = calculator.getResult();
                    outputWriter.writeOutput("Answer: ");
                    break;
                }
            }
            break;
        }
    }
}