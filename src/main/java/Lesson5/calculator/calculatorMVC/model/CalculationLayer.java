package Lesson5.calculator.calculatorMVC.model;

import Lesson5.calculator.calculatorMVC.model.divideOperation.DivideOperation;
import Lesson5.calculator.calculatorMVC.model.multiplyOperation.MultiplyOperation;
import Lesson5.calculator.calculatorMVC.model.substractOperation.SubstractOperation;
import Lesson5.calculator.calculatorMVC.model.sumOperation.SumOperation;

public class CalculationLayer {
    public double add(double a, double b) {
        SumOperation sumOperation = new SumOperation(a,b);
        return sumOperation.sum();
    }

    public double subtract(double a, double b) {
        SubstractOperation substractOperation = new SubstractOperation(a,b);
        return substractOperation.subtract();
    }

    public double multiply(double a, double b) {
        MultiplyOperation multiplyOperation =  new MultiplyOperation(a, b);
        return multiplyOperation.multiply();
    }

    public double divide(double a, double b) {
        DivideOperation divideOperation = new DivideOperation(a,b);
        return divideOperation.divide();
    }
}
