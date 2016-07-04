class GCD {

   public static int gcd (int a, int b) {
      if (a==0) {
         return b;
      } else if (b==0) {
         return a;
      } else if (a<0) {
         return (gcd (-a, b));
      } else if (b<0) {
         return (gcd (a, -b));
      } else {
         return (gcd (b, (a%b)));
      }
   }

   public static void main ( String [] args) {
      System.out.println (gcd (-2, 2));
   }
}
