package calculator.model;

public class Calculator
{
    private State currentState;
    private double currentNumber;
    private double storedNumber;
    private int decimalNumberCount;
    private double repeatNumber;
    public Calculator()
    {
        currentState = new NumberState(this);
        currentNumber = 0.0;
        storedNumber = 0.0;
        repeatNumber = 0.0;
        decimalNumberCount = 1;
    }
    public void setState(/*???*/) {/*???*/}
    public void setCurrentNumber(double number) {this.currentNumber = number;}
    public void setStoredNumber(double number) {this.storedNumber = number;}
    public void setDecimalNumberCount(int decimalNumberCount) {this.decimalNumberCount = decimalNumberCount;}
    public void setRepeatNumber(double repeatNumber) {this.repeatNumber = repeatNumber;}
    public /*???*/ getState() {/*???*/}
    public double getCurrentNumber() {return currentNumber;}
    public double getStoredNumber() {return storedNumber;}
    public int getDecimalNumberCount() {return decimalNumberCount;}
    public double getRepeatNumber() {return repeatNumber;}
    public double displayNumber() {return currentNumber;}
    public void clearPressed() {currentState.clearPressed();}
    public void numberPressed(int number) {currentState.numberPressed(number);}
    public void dividePressed() {currentState.dividePressed();}
    public void multiplyPressed() {currentState.multiplyPressed();}
    public void subtractPressed() {currentState.subtractPressed();}
    public void addPressed() {currentState.addPressed();}
    public void equalsPressed() {currentState.equalsPressed();}
    public void decimalPressed() {currentState.decimalPressed();}
}
