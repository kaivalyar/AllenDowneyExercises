class Rational {
   int n, d;

//c)
   public Rational () {
      this.n = 0;
      this.d = 0;
   }

//g)
   public Rational (int num, int den) {
      this.n = num;
      this.d = den;
   }

//d)
   public static void printRational (Rational r) {
      System.out.println (r.n + "/" + r.d);
   }

//h)
   public static void negate (Rational r) {
      r.n = -(r.n);
   }

//i)
   public static void invert (Rational r) {
      int hold = r.n;
      r.n = r.d;
      r.d = hold;
   }

//j)
   public static double toDouble (Rational r) {
      return (r.n/r.d);
   }

//k) [ambiguous question: modifier or pure function ]
   public static Rational reduce (Rational r) {
      int g = gcd(r.n, r.d);
      Rational f = new Rational(r.n/g, r.d/g);
      return f;
   }

// l)
   public static Rational add (Rational r, Rational s) {
      return new Rational ((r.n * s.d) + (r.d * s.n), (r.d * s.d));
   }


// main
   public static void main (String [] args) {
      Rational r = new Rational();//invoking c)   public Rational ()

      r = new Rational (1, 2);//invoking g)   public Rational (int num, int den)

      printRational (r);//invoking d)   public static void printRational (Rational r) 

      negate (r);//invoking h)   public static void negate (Rational r)
      printRational (r);

      invert (r);//invoking i)   public static void invert (Rational r)
      printRational (r);

      double d = toDouble (r);//invoking j)   public static double toDouble (Rational r)
      System.out.println (d);// testing method

      r = new Rational (10, 10);
      r = reduce(r);//invoking k)   public static Rational reduce (Rational r)
      printRational (r);// testing method

      r = add(r, r);//invoking l)   public static Rational add (Rational r, Rational s)
      printRational (r);// testing method

   }

// HELPER METHOD:
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

}
