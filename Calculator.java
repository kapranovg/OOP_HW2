public class Calculator {
    private double result;
    
    public double getResult() {
        return result;
    }
    
    public void setResult(double result) {
        this.result = result;
    }
    
    public void add(double num1, double num2) {
        result = num1 + num2;
    }
    
    public void subtract(double num1, double num2) {
        result = num1 - num2;
    }
    
    public void multiply(double num1, double num2) {
        result = num1 * num2;
    }
    
    public void divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("На 0 делить нельзя!");
        }
        result = num1 / num2;
    }
}