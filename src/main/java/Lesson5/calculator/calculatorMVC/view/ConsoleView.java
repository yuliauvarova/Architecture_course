package Lesson5.calculator.calculatorMVC.view;

import Lesson5.calculator.calculatorMVC.model.CalculationLayer;


public class ConsoleView implements IView {
    InputOutputLayer ioLayer;
    CalculationLayer calcLayer;

    public ConsoleView() {
        ioLayer = new InputOutputLayer();
        calcLayer = new CalculationLayer();
    }

    @Override
    public void runCalculator() {

        calcLayer.subtract(Double.parseDouble(ioLayer.getInput()), Double.parseDouble(ioLayer.getInput()));
    }
}
