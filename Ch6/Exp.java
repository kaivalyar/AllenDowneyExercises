class Exp {


// helper methods:

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



   public static double pow (double x, int n) {
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





// a)
   public static double myexp (double x) {
      int i =0 ;
      double temp = 0.0;
      while (i < 11) {
         temp = temp + ( pow (x, i))/ factorial (i) ;
         i =i +1;
      }
      return temp;
   }

// b)

// here a second, accuracy parameter was added

   public static double myexp (double x, int accuracy) {
      int i = 1;
      double temp =0.0;
      double num =1.0;
      double den = 1.0;

      while (i <= accuracy) {
         temp= temp + (num/den);
         num = num * x;
         den = den * i;
         i = i+1;
      }
      return temp;
}

// c)

   public static void check (double x) {
      int i = 1;
      while (i<2) {
         System.out.println (x + "\t" + (Math.exp(x)) + "\t" + (myexp(x,20)) );
         x = x+1.0;
         i = i+ 1;
      }
   }
         





// here is an alternate version of check which takes 3 parameters!!!!!

   public static void check (int x, int n, int p) {
//    'x' is the power to which 'e' will be raised
//    'n' is the accuracy level for myexp
//    'p' is the no. of rows in the output (the table)
//    'i' is a loop variable
      int i =1;
      while (i < p) {
         System.out.println (x + "\t" + (Math.exp(x)) + "\t" + (myexp(x,n)) );
         x=x+1;
         i=i+1;
      }
   }



// d)
   public static int fineTuner () {
      double tempTry = myexp (1.0, 2) ;
      double actuall = Math.exp (1.0) ;
      int i =1;
      while (tempTry != actuall) {
         tempTry = myexp (1,i);
         i = i+1;
      }
      return i;
   }

   public static void main ( String [] args){
      System.out.println (myexp (1,20));
      check (1, 17, 10);
      System.out.println (fineTuner());

// e)
      double i = 0.1;
      while (i<101.0) {
         check (i);
         i = i * 10;
      }

// f)
      double j = -0.1;
      while (j > (-101.0)) {
         check (j);
         j = j * 10.0;
      }
   }

}
