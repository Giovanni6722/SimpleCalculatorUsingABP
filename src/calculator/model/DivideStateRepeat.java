package calculator.model;

public class DivideStateRepeat implements State {
    private Calculator calculator;
    public DivideStateRepeat(Calculator calculator) {this.calculator = calculator;}
    @Override public double displayNumber() {return calculator.getCurrentNumber();}
    @Override
    public void clearPressed()
    {
        calculator.setCurrentNumber(0);
        calculator.setStoredNumber(0);
        calculator.setDecimalNumberCount(1);
        calculator.setState(new NumberState(calculator));
    }
    @Override
    public void numberPressed(int number)
    {
        double currentNumber = calculator.getCurrentNumber();
        double newNumber = currentNumber * 10 + number;
        calculator.setCurrentNumber(newNumber);
    }
    @Override
    public void dividePressed()
    {
        calculator.setStoredNumber(calculator.getCurrentNumber());
        calculator.setState(new DivideState(calculator));
        calculator.setCurrentNumber(0);
    }
    @Override
    public void multiplyPressed()
    {
        calculator.setStoredNumber(calculator.getCurrentNumber());
        calculator.setState(new MultiplyState(calculator));
        calculator.setCurrentNumber(0);
    }
    @Override
    public void subtractPressed()
    {
        calculator.setStoredNumber(calculator.getCurrentNumber());
        calculator.setState(new SubtractState(calculator));
        calculator.setCurrentNumber(0);
    }
    @Override public void addPressed()
    {
        calculator.setStoredNumber(calculator.getCurrentNumber());
        calculator.setState(new AddState(calculator));
        calculator.setCurrentNumber(0);
    }
    @Override
    public void equalsPressed()
    {
        calculator.setCurrentNumber(calculator.getCurrentNumber() / calculator.getRepeatNumber());
    }
    @Override
    public void decimalPressed()
    {
        calculator.setDecimalNumberCount(1);
        calculator.setState(new AddDecimalState(calculator));
    }
}
