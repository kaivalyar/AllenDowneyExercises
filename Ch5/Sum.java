class Sum {

//    No Better names were found for the methods.


   public static int methOne (int m, int n) {// infinite[stack overflow exception], if m>n
      System.out.println (m + " " + n);
      if (m == n) {
         return n;// the only return statement in the method
      } else {
         return m + methOne (m+1, n);// recursion: Trying to make m=n, by increasin m by 1 each time; will eventually give m + n OR recurse infinitely
      }
   }

   public static int methTwo (int m, int n) {
//          infinite, if m>n
//          the same as prod, finds the factorial of n, if m=1
      System.out.println (m + " " + n);
      if (m == n) {
         return n;
      } else {
         return n * methTwo (m, n-1);
      }
   }

   public static void main ( String [] args ) {
      System.out.println (methOne(3,2));
      System.out.println (methTwo(3,2));
   }


}
