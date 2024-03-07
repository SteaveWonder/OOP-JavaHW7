package logOperator;

import model.Calculable;
import model.Calculator;
import model.ICalculableFactory;

public class LogCalculableFactory implements ICalculableFactory {
    private Logger logger;
    public LogCalculableFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(double mainArg) {
        return new LogCalculator(new Calculator(mainArg), logger);
    }
}
