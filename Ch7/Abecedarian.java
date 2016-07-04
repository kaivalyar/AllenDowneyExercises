class Abecedarian {

// * this program was written without the knowledge of the == operator being applicable for chars

   public static void main (String [] args) {
      System.out.println (isAbecedarian("acb"));
      System.out.println (isAbecedarian("abcdef"));
   }

// helper method: (copied from pg. 61)
   public static String rest (String s) {
      return s.substring (1, s.length());
   }

   public static boolean isAbecedarian (String s){
      if (s.length()<2) {
         return true;
      }
      String f = s.charAt (0) + "";
      String rest = rest(s);
      int diff = rest.compareTo(f);
      if (diff>0) {
         return isAbecedarian (rest(s));
      } else {
         return false;
      }
   }


}
