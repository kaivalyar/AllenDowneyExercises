class Gauss {


// Gauss either doesn't have a logical error, or it seems to be displaying a largely inaccurate value. This might be due to the nature of the program [the series it uses]

   public static double gauss (int x) {
      double num = 1.0;
      double den = 1.0;
      double i = 1.0;
      double k = 1.0;
      double sign = 1.0;
      double fraction = 1.0;
      while (i < 50.0) {
         num = (num * x);
         den = den * i;
         sign = sign * -1;
         fraction = fraction + (sign*k*num/den);
         i=i+1.0;
         k=k+1.0;
      }
      return fraction;
   }

   public static void main (String [] args) {
      System.out.println (gauss (1));
      System.out.println (Math.exp(-1));
   }

}
