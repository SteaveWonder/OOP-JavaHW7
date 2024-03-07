package model;

public class CalculableFactory implements ICalculableFactory {

    @Override
    public Calculable create(double mainArg) {
        return new Calculator(mainArg);
    }
}
