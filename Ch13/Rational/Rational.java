
/**
 * 12.4, convering class methods to object methods, familiarising error messages, discovering pros and cons of OOP
 * 
 * @author Kaivalya Rawal
 * @version 15/04/2011
 */

// Represents a rational number
class Rational {
     int numerator, denominator;

     // simple constructor that sets the numerator
     // and denominator of the rational number to 0
     public Rational() {
          this.numerator = 0;
          this.denominator = 0;
     }

     public Rational(int numerator, int denominator) {
          this.numerator = numerator;
          this.denominator = denominator;
     }

     public void printRational() {
          System.out.println(numerator + "/" + denominator);
     }

     // negate is a modifier that reverses the sign of the rational number
     public void negate() {
          int numerator = this.numerator;
          int negatedNumerator = -1 * numerator;
          this.numerator = negatedNumerator;
     }

     // invert is a modifier that swaps the numerator and denominator of the rational number
     public void invert() {
          int oldNumerator = this.numerator;
          this.numerator = this.denominator;
          this.denominator = oldNumerator;
     }

     // toDouble is a pure function that returns the rational number expressed as a decimal
     public double toDouble() {
          double numerator = this.numerator;
          double denominator = this.denominator;
          return numerator / denominator;
     }

     // returns the gcd of two integers
     public static int gcd(int a, int b) {
          if (b == 0) {
              return a;
          }
          int r = a % b;
          return gcd(b, r);
     }

     // reduce is a modifier that reduces a rational number to its lowest terms
     public void reduce() {
          int gcd = gcd(this.numerator, this.denominator);
          this.numerator = this.numerator / gcd;
          this.denominator = this.denominator / gcd;
     }

      // returns the sum of the two rational numbers
     public Rational add(Rational r) {
          int newNumerator = r.numerator * this.denominator + r.denominator * this.numerator;
          int newDenominator = r.denominator * this.denominator;
          Rational newRational = new Rational(newNumerator, newDenominator);
          newRational.reduce();
          return newRational;
     }

     public static void main() {
         // Create a new rational number and set it to 2/3
         Rational rational1 = new Rational();
         rational1.numerator = 2;
         rational1.denominator = 3;
         rational1.printRational(); // 2/3

         // Create a rational number using the second constructor
         Rational rational2 = new Rational(4, 5);
         rational2.printRational(); // 4/5

         // Negate the rational number
         rational1.negate();
         rational1.printRational(); // -2/3

         // Invert the numerator and denominator
         rational1.invert();
         rational1.printRational(); // 3/-2

         // Convert the rational number to a double
         double decimal = rational1.toDouble();
         System.out.println(decimal); // -1.5

         // Reduce a rational number to its lowest terms
         Rational rational3 = new Rational(7, 21);
         rational3.printRational(); // 7/21
         rational3.reduce();
         rational3.printRational(); // 1/3
                
         // Sum two rationals
         rational2.add(rational3).printRational(); // 17/15
     }
}