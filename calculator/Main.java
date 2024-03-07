import logOperator.Log;
import logOperator.LogCalculableFactory;
import model.ICalculableFactory;
import view.ConsoleInputReader;
import view.ConsoleOutputWriter;
import view.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new Log());
        ViewCalculator view = new ViewCalculator(calculableFactory, new ConsoleInputReader(), new ConsoleOutputWriter());
        view.run();
    }
}