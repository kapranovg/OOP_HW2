import java.util.Scanner;

public class OOPCalculator {
    private Calculator calculator;
    private Scanner scanner;
    
    public OOPCalculator() {
        calculator = new Calculator();
        scanner = new Scanner(System.in);
    }
    
    public void start() {
        while (true) {
            System.out.print("Введите операцию (+, -, *, /) или 'exit': ");
            String operation = scanner.nextLine();
            
            if (operation.equals("exit")) {
                break;
            }
            
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();
            
            switch (operation) {
                case "+":
                    calculator.add(num1, num2);
                    break;
                case "-":
                    calculator.subtract(num1, num2);
                    break;
                case "*":
                    calculator.multiply(num1, num2);
                    break;
                case "/":
                    try {
                        calculator.divide(num1, num2);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                default:
                    System.out.println("Неправильная операция");
                    continue;
            }
            
            System.out.println("Результат равен: " + calculator.getResult());
            System.out.println();
            scanner.nextLine();
        }
    }
}