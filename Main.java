public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new SimpleComplexNumber(3, 2);
        ComplexNumber num2 = new SimpleComplexNumber(1, 4);

        ComplexCalculator calculator = new ComplexCalculator();
        System.out.println("Числа для теста: " + num1 + " и " + num2);

        ComplexNumber sum = calculator.add(num1, num2);
        System.out.println("Сумма: " + sum);

        ComplexNumber product = calculator.multiply(num1, num2);
        System.out.println("Умножение: " + product);

        ComplexNumber quotient = calculator.divide(num1, num2);
        System.out.println("Частное: " + quotient);

    }

}
