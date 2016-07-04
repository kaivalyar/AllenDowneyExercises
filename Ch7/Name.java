class Name {

// * this program was written without the knowledge of the == operator being applicable for chars

   public static void main (String [] args) {

      System.out.println ("The names being compared are: Kaivalya Rawal, and Priyanath Chandrasekhar");

      if ((compareName ("Kaivalya Rawal", "Priyanath Chandrasekhar"))<0) {
         System.out.println ("In a directory with alphabetical sorting, the first name would appear first!");
      } else if ((compareName ("Kaivalya Rawal", "Priyanath Chandrasekhar"))>0) {
         System.out.println ("In a directory with alphabetical sorting, the second name would appear first!");
      } else {
         System.out.println ("Sorry, both names are the same.");
      }

   }

   public static boolean hasComma (String s) {
      return (s.indexOf(',')>=0);
   }

   public static String convertName (String s) {
      if (hasComma (s)) {
         return s;
      } else {
// an extra assumtion: the name may have 3 or more words, and 2 or more spaces
         int splitIndex = s.lastIndexOf (" ");
         s = s + ",";
         String part1 = s.substring (0, splitIndex);
         String part2 = s.substring (splitIndex+1, s.length());
         return (part2 + " " + part1);
      }
   }

   public static int compareName (String s1, String s2) {
      s1 = convertName (s1.toUpperCase());
      s2 = convertName (s2.toUpperCase());
      int act = s1.compareTo(s2);
      if (act < 0) {
         return 1;
      } else if (act > 0) {
         return -1;
      } else {
         return act;
      }
   }


}
