package calculator_client;


public class Calculator_Client {

    public static void main(String[] args) {
    try {
        int i = 3;
        int j = 4;
        int result1 = add(i, j);
        int result2 = div(i, j);
        int result3 = multiply(i, j);
        int result4 = substract(i, j);
        System.out.println("Result = " + result1);
    } catch (Exception ex) {
        System.out.println("Exception: " + ex);
    }
    }

    private static int add(int arg0, int arg1) {
        com.calculator.CalculatorService service = new com.calculator.CalculatorService();
        com.calculator.Calculator port = service.getCalculatorPort();
        return port.add(arg0, arg1);
    }

    private static int multiply(int arg0, int arg1) {
        com.calculator.CalculatorService service = new com.calculator.CalculatorService();
        com.calculator.Calculator port = service.getCalculatorPort();
        return port.multiply(arg0, arg1);
    }

    private static int div(int arg0, int arg1) {
        com.calculator.CalculatorService service = new com.calculator.CalculatorService();
        com.calculator.Calculator port = service.getCalculatorPort();
        return port.div(arg0, arg1);
    }

    private static int substract(int arg0, int arg1) {
        com.calculator.CalculatorService service = new com.calculator.CalculatorService();
        com.calculator.Calculator port = service.getCalculatorPort();
        return port.substract(arg0, arg1);
    }
    
    
}
