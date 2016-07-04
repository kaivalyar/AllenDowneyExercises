class PrintDate{

   public static void printAmerican (String day, String month, int date, int year){
      System.out.println (day + ", " + month + " " + date + ", " + year);
   }

   public static void printEuropean (String day, int date, String month, int year){
      System.out.println (day + " " + date + " " + month + ", " + year);
   }

   public static void main (String [] args){
      System.out.println ("American Format:");
      printAmerican ("Wedneseday", "October", 13, 2010);
      System.out.println ("European Format:");
      printEuropean ("Wedneseday", 13, "October", 2010);
   }
}
