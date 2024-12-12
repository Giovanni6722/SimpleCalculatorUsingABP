package calculator.model;

public class NumberState implements State {
    private Calculator calculator;
    private double currentNumber;

    public NumberState(Calculator calculator) {
        this.calculator = calculator;
        this.currentNumber = 0.0;
    }

    @Override
    public double displayNumber() {
        return calculator.getCurrentNumber();
    }

    @Override
    public void clearPressed() {
        calculator.setCurrentNumber(0.0);
        calculator.setStoredNumber(0);
        calculator.setDecimalNumberCount(1);
    }

    @Override
    public void numberPressed(int number) {
        currentNumber = currentNumber * 10 + number;
        calculator.setCurrentNumber(currentNumber);
    }

    @Override
    public void dividePressed() {
        calculator.setState(new DivideState(calculator));
        calculator.setStoredNumber(currentNumber);
        calculator.setCurrentNumber(0);
    }

    @Override
    public void multiplyPressed() {
        calculator.setState(new MultiplyState(calculator));
        calculator.setStoredNumber(currentNumber);
        calculator.setCurrentNumber(0);
    }

    @Override
    public void subtractPressed() {
        calculator.setState(new SubtractState(calculator));
        calculator.setStoredNumber(currentNumber);
        calculator.setCurrentNumber(0);
    }

    @Override
    public void addPressed() {
        calculator.setState(new AddState(calculator));
        calculator.setStoredNumber(currentNumber);
        calculator.setCurrentNumber(0.0);
    }

    @Override
    public void equalsPressed() {
    }

    @Override
    public void decimalPressed() {
        calculator.setDecimalNumberCount(1);
        calculator.setState(new DecimalState(calculator));
    }
}
