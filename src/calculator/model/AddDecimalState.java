package calculator.model;

public class AddDecimalState implements State{
    private Calculator calculator;
    public AddDecimalState(Calculator calculator) {this.calculator = calculator;}
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
        double newNumber = Math.pow(10,  calculator.getDecimalNumberCount());
        newNumber = number / newNumber;
        newNumber = currentNumber + newNumber;
        int currentDecimal = calculator.getDecimalNumberCount();
        calculator.setDecimalNumberCount(currentDecimal + 1);
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
    @Override public void addPressed(){}
    @Override
    public void equalsPressed()
    {
        calculator.setRepeatNumber(calculator.getCurrentNumber());
        calculator.setCurrentNumber(calculator.getStoredNumber() + calculator.getCurrentNumber());
        calculator.setState(new AddStateRepeat(calculator));
    }
    @Override public void decimalPressed() {}
}
