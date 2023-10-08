package Lesson5.calculator.calculatorMVC.view;

public class InputOutputLayer {

    String getInput() {
        // Чтение ввода пользователя
        InputSlice inputSlice = new InputSlice();
        return inputSlice.getInput();
        }

    void displayOutput(String result) {
        // Вывод результата на экран
        OutputSlice outputSlice = new OutputSlice();
        outputSlice.displayOutput(result);
    }
}
