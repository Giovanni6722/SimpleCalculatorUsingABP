package calculator.model;

public interface State {
    double displayNumber();
    void clearPressed();
    void numberPressed(int number);
    void dividePressed();
    void multiplyPressed();
    void subtractPressed();
    void addPressed();
    void equalsPressed();
    void decimalPressed();
}
