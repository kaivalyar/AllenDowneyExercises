class Code {

/*

SUMMARY OF DIFFERENT METHODS [as they have bad names] 

-coder1 : +13
-decoder1 : -13
-coder2 : +cipher (generalised)
-coder3: doesn't encode spaces

*/

   public static void main ( String [] args ) {
      System.out.println (("Check Testing Check Testing"));
      System.out.println (coder3("Check Testing Check Testing", 13));
      System.out.println (coder1("Check Testing Check Testing"));
      System.out.println (decoder1("Purpx Grfgvat Purpx Grfgvat"));
   }


/*
the question was slightly ambiguous, it was assumed that in the coded String, spaces were to be left at the same index's as the index's where they were found in the uncoded String (The other option being to omit them altogether)
*/


   public static String coder1 (String s) {
      if (s.length() == 0) {
         return "";
      }
      String small = ("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
      String caps = ("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ");
      String spaces = ("                           ");// contains 26 spaces
      String standard = (small + caps + spaces);
      char f = s.charAt (0);// extracting first char in s, preparing to encode
      int index = standard.indexOf(f);// finding the index for that letter in standard
      String g = standard.charAt(index + 13) + "";// finding and coding the first letter
      return (g + coder1 (s.substring(1, s.length())));// returning the coded letter, [and the rest of the coded string]
   }


   public static String decoder1 (String s) {
      if (s.length() == 0) {
         return"";
      }
      String small = ("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyza");
      String caps = ("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ");
      String spaces = ("                           ");// contains 26 spaces
      String standard = (small + caps + spaces);// this 'elaborate' technique of assignment was used to illustrate the logic better
      char f = s.charAt (0);
      int index = standard.lastIndexOf(f);
      String g = standard.charAt(index - 13) + "";
      return (g + decoder1 (s.substring(1, s.length())));
   }


// generalised version
   public static String coder2 (String s, int cipher) {
      if (cipher >= 26) {
         coder2 (s, (cipher%26));
      }
      if (s.length() == 0) {
         return "";
      }
      String small = ("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyza");
      String caps = ("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ");
      String spaces = ("                           ");// contains 26 spaces
      String standard = (small + caps + spaces);
      char f = s.charAt (0);// extracting first char in s, preparing to encode      
      int index;
      if (cipher >= 0) {
         index = standard.indexOf(f);// finding the index for that letter in standard
      } else {
         index = standard.lastIndexOf(f);// doing the same thing, except this allows subtraction, not addition
      }
      
      String g = standard.charAt(index + (cipher)) + "";// finding and coding the first letter
      return (g + coder2 (s.substring(1, s.length()), cipher) ) ;// returning
   }


// here is a method that wouldn't have any spaces in the encoded version
   public static String coder3 (String s, int cipher) {
      return coder2 (s.replaceAll(" ", ""), cipher);// here replaceAll replaces " " with "" at all places in this String
   }

}
