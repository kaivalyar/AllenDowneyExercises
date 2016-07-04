import java.math.*;

class Big{

   public static void main (String [] args) {
      System.out.println (power(987,654));
      System.out.println (Math.pow(987,654));
      // The first (integer) table
      int i = 1;
      while (i<30) {
         System.out.println (i + "\t" + factorial(i));
         i++;
      }
      // the second (big integer) table
      int j =1;
      while (j<30) {
         System.out.println (j + "\t" + factorialBig(j));
         j++;
      }
   }


// THE INTEGER VERSION
   public static int factorial (int n) {
      if (n == 0) {
         return 1;
      }

      int temp = n;
      while (n > 1 ) {
         temp = temp * (n-1);
         n=n-1;
      }
      return temp;
   }


// THE BIGINTEGER VERSION
   public static BigInteger factorialBig (int n){
       if (n == 0) return BigInteger.valueOf(1);
      BigInteger temp = BigInteger.valueOf(n);
      BigInteger m;
      while (n > 1 ) {
         m = BigInteger.valueOf(n-1);
         temp = temp.multiply(m);
         n--;
      }
      return temp;
   }


// the power method
   public static BigInteger power (int a, int b) {
      if (b==0) return BigInteger.valueOf(1);
      BigInteger t = BigInteger.valueOf(1);
      int i = 1;
      BigInteger bigA = BigInteger.valueOf(a);
      while (i< b/2) {
         t=t.multiply(bigA);
         i++;
      }
      t = t.multiply (t);
      if (b%2==0) return t;
      else return (t.multiply(bigA));

   }
}
