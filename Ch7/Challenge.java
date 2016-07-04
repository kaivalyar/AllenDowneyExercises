class Challenge {

   public static void main (String [] args) {
      System.out.println (countLetters('b', "banana"));
      System.out.println (countLetters('a', "banana"));
      System.out.println (countLetters('n', "banana"));
//      System.out.println (countLetters('a', "banana"));
//      System.out.println (countLetters('n', "banana"));
//      System.out.println (countLetters('a', "banana"));
   }

   public static int countLetters (char l, String s) {
      int i= 0;
      int count = 0;
      while (i <= s.lastIndexOf(l) && i>= 0) {
         if (s.indexOf(l, i) >=i ) {
            count ++;
         }
         i = s.indexOf(l, i) + 1;
      }
      return count;
   }

}
