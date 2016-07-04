class Palindrome{

// * this program was written without the knowledge of the == operator being applicable for chars

   public static String first (String s){
      return s.charAt (0) + "";
   }

   public static String last (String s){
      return s.charAt (s.length()-1) + "";
   }

// this method is overly large and complicated as it was written without the knowledge of substring
// it has the same effect as : s.substring (1, s.length() -1);
   public static String middle (String s){
      int length = s.length();
      if (length <3) {
         return "";
      }
      String middle = "";
      int i=1;
      while (i < (length-1)) {
         middle = middle + s.charAt(i);
         i++;
      }
      return middle;
   }

// first (recursive) version, using Downey's definition for a palindrome
// this is case sensitive
   public static boolean isPalindrome (String s) {
      int length = s.length ();
      if (length == 0 || length == 1) {
         return true;
      } else if (length == 2) {
         String f = first (s);
         String l = last (s);
         return (f.equals(l));
      }else {
         String f = first (s);
         String l = last (s);
         if (f.equals(l) ){
            return (isPalindrome(middle(s)));
         } else {
            return false;
         }
      }
   }

// efficient iterative version, uses a completely different definition of a palindrome
// even this is case sensitive
   public static boolean isPalindromeIter (String s) {
      int l = s.length ();
      int i = l-1;
      String total = "";
      while (i>=0) {
         char ch = s.charAt (i);
         total = total + ch;
         i--;
      }
      return (s.equals(total));
   }

// this is case insensitive
   public static boolean isPalindromeIgnoreCase (String s) {
      return (isPalindromeIter(s.toUpperCase()));
   }


   public static void main (String [] args) {
      System.out.println(isPalindrome("Qoprpoq"));
      System.out.println (isPalindromeIter("Qoprpoq"));
      System.out.println (isPalindromeIgnoreCase("RaceCar"));
   }

}
