package model;

public interface Calculable {
    Calculable sum(double arg);
    Calculable difference(double arg);
    Calculable multiplication(double arg);
    Calculable division(double arg);
    double getResult();
}
