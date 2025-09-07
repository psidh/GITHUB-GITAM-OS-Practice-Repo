// hard-level
package Java;

import java.util.Scanner;

class Complex {
    double real;
    double imag;

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to multiply this complex number with another
    Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imag * other.imag;
        double imagPart = this.real * other.imag + this.imag * other.real;
        return new Complex(realPart, imagPart);
    }

    // Method to display the complex number
    void display() {
        System.out.printf("%.2f + %.2fi\n", real, imag);
    }
}

public class ComplexMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real and imaginary part of first complex number: ");
        double real1 = sc.nextDouble();
        double imag1 = sc.nextDouble();

        System.out.print("Enter real and imaginary part of second complex number: ");
        double real2 = sc.nextDouble();
        double imag2 = sc.nextDouble();

        Complex c1 = new Complex(real1, imag1);
        Complex c2 = new Complex(real2, imag2);

        Complex product = c1.multiply(c2);

        System.out.print("Product = ");
        product.display();

        sc.close();
    }
}

// try implementing it using a different approach; for example, by using static methods and passing complex numbers as parameters rather than instance methods.