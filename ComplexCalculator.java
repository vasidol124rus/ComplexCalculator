import java.util.logging.Level;
import java.util.logging.Logger;

public class ComplexCalculator {

    private static final Logger LOGGER = Logger.getLogger(ComplexCalculator.class.getName());

    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        LOGGER.log(Level.INFO, "Сложение комплексных чисел");
        return num1.add(num2);

    }

    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        LOGGER.log(Level.INFO, "Умножение комплексных чисел");
        return num1.multiply(num2);
    }

    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        LOGGER.log(Level.INFO, "Деление комплексных чисел");
        return num1.divide(num2);
    }
}
