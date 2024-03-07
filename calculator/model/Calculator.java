package model;

public final class Calculator implements Calculable {
    private double mainArg;
    public Calculator(double mainArg) {
        this.mainArg = mainArg;
    }
    @Override
    public Calculable sum(double arg) {
        mainArg += arg;
        return this;
    }

    @Override
    public Calculable difference(double arg) {
        mainArg -= arg;
        return this;
    }

    @Override
    public Calculable multiplication(double arg) {
        mainArg *= arg;
        return this;
    }

    @Override
    public Calculable division(double arg) {
        mainArg /= arg;
        return this;
    }

    @Override
    public double getResult() {
        return mainArg;
    }
}
