package Lesson5.calculator.calculatorMVC.model.substractOperation;

public class SubstractOperation {

    double firstArg;
    double secondArg;

    public SubstractOperation(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }
    public double subtract() {
        return firstArg - secondArg;
    }
}
