class SquareRoot {

   public static void main ( String [] args ) {
      int i = 1;
      while (i < 11) {
	   System.out.println (i + "  " + (sqrt(i)));
      i = i+ 1;
      }
   }

// a greater level of accuracy was chosen (albeit arbitrarily), and implemented
   public static double sqrt (double a) {
      double p = a/2 ;
      double newp = (p + a / p) / 2 ;
      while ( Math.abs (newp - p ) > 0.000000000000000000000000000000001 ) {
         p = (p + a / p) /2 ;
         newp = (p + a / p)/2;
      }
      return (newp);
   }

}
