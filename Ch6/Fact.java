class Fact {

   public static void main ( String [] args) {
      System.out.println (factorial (7));
   }

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

}
