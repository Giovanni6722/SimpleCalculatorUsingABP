package calculator.model;

public class MultiplyState implements State {
    private Calculator calculator;

    public MultiplyState(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double displayNumber() {
        return calculator.getCurrentNumber();
    }

    public void clearPressed() {
        calculator.setCurrentNumber(0);
        calculator.setStoredNumber(0);
        calculator.setDecimalNumberCount(1);
        calculator.setState(new NumberState(calculator));
    }

    @Override
    public void numberPressed(int number) {
        double currentNumber = calculator.getCurrentNumber();
        double newNumber = currentNumber * 10 + number;
        calculator.setCurrentNumber(newNumber);
    }

    @Override
    public void dividePressed() {
        calculator.setStoredNumber(calculator.getCurrentNumber());
        calculator.setState(new DivideState(calculator));
        calculator.setCurrentNumber(0);
    }

    @Override
    public void multiplyPressed() {
    }

    @Override
    public void subtractPressed() {
        calculator.setStoredNumber(calculator.getCurrentNumber());
        calculator.setState(new SubtractState(calculator));
        calculator.setCurrentNumber(0);
    }

    @Override
    public void addPressed() {
        calculator.setStoredNumber(calculator.getCurrentNumber());
        calculator.setState(new AddState(calculator));
        calculator.setCurrentNumber(0);
    }
    @Override
    public void equalsPressed() {
        calculator.setRepeatNumber(calculator.getCurrentNumber());
        calculator.setCurrentNumber(calculator.getStoredNumber() * calculator.getCurrentNumber());
        calculator.setState(new MultiplyStateRepeat(calculator));
    }
    @Override
    public void decimalPressed() {
        calculator.setDecimalNumberCount(1);
        calculator.setState(new MultiplyDecimalState(calculator));
    }
}