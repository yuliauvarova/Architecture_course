package Lesson5.calculator.calculatorMVC.model.multiplyOperation;

public class MultiplyOperation {

    double firstArg;

    double secondArg;

    public MultiplyOperation(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public double multiply(){
        return firstArg * secondArg;
    }
}
