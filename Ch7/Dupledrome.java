class Dupledrome {

// * this program was written without the knowledge of the == operator being applicable for chars

   public static void main (String [] args) {
      System.out.println (isDupledrome("abcc"));// false
      System.out.println (isDupledrome("abbc"));// false
      System.out.println (isDupledrome("aacc"));// true
      System.out.println (isDupledrome("acxca"));// false
   }


// helper method [returns the whole String except first 2 chars] :
   public static String remaining (String s) {
      return (s.substring (2, s.length()));
   }


   public static boolean isDupledrome (String s) {
      if (s.length()%2==1) {
         return false;
      } else if (s.length()==0) {
         return true; // this might be a logical error, as the definition of a dupledrome is unclear in this respect
      } else {
         String char1 = s.charAt (0) + "";
         String char2 = s.charAt (1) + "";
         if (char1.equals(char2)) {
            return (isDupledrome(remaining(s)));
         } else {
            return false;
         }
      }
      
   }



}
