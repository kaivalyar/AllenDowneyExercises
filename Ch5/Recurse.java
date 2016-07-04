class Recurse {

// the copied methods
   public static char first (String s) {
      return s.charAt (0);
   }

   public static String rest (String s) {
      return s.substring (1, s.length());
   }

   public static int length (String s) {
      return s.length ();
   }



// the exercise methods
   public static void printString (String s) {
      int length = length (s);
      if (length==1) {
         System.out.println (s);
      } else {
         System.out.println (first (s));
         printString (rest (s));
      }
   }


   public static void printBackward (String s) {
      int l = length (s);
      if (l == 1) {
         System.out.println (s);
      } else {
         printBackward (rest (s));
         System.out.println (first (s));
      }
   }

   public static String reverseString (String s) {
      int l = length (s);
      if (l == 1) {
         return (s);
      } else {
         return ((reverseString (rest (s))) + "" + first (s));
      }
   }


   public static void main (String [] args ) {
      printString ("abc");
      printBackward ("abc");
      System.out.println (reverseString ("abc"));
   }

}
