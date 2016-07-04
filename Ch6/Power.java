class Power {

   public static void main ( String [] args ) {
      System.out.println (power (3.0 , 4));
   }

   public static double power (double x, int n) {
      if (n==0) {
         return 1;
      }
      int i =1;
      double temp = 1.0;
      while ( i <= n) {
         temp = temp * x;
         i = i + 1;
      }
      return temp;
   }

}
