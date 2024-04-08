public class SimpleComplexNumber implements ComplexNumber {
    private double real;
    private double imaginary;

    public SimpleComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;

    }

    @Override
    public ComplexNumber add(ComplexNumber num) {
        SimpleComplexNumber other = (SimpleComplexNumber) num;
        return new SimpleComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num) {
        SimpleComplexNumber other = (SimpleComplexNumber) num;
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new SimpleComplexNumber(newReal, newImaginary);
    }

    @Override
    public ComplexNumber divide(ComplexNumber num) {
        SimpleComplexNumber other = (SimpleComplexNumber) num;
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new SimpleComplexNumber(newReal, newImaginary);

    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
