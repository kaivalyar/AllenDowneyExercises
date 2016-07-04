class Distance {

// At first temporary variables were used, but then turned into compound expressions by copy pasting

   public static double distance (double x1, double y1, double x2, double y2) {
/*
      double p = x2 - x1;
      double q = y2 - y1;
      double z = sumSquares (p, q);
      return (Math.sqrt z);
*/

      return (Math.sqrt (sumSquares (x2 - x1, y2 - y1)));
   }

   public static double sumSquares (double a, double b) {
/*
      double square1 = a*a;
      double square2 = b*b;
      double over = square1 + square2;
      return over;
*/
      return (a*a + b*b);
   }

   public static void main (String [] args) {
//    double over = distance (1.0, 2.0, 3.0, 4.0);
//    System.out.println (over);
      System.out.println (distance (1.0, 2.0, 3.0, 4.0));
   }

}
