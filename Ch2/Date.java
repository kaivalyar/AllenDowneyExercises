class Date{

   public static void main (String[] args) {
      String day, month;//declaration statement for the string variables
      int date, year;//declaration statement for the int variables
      day="Friday";
      month="October";
      year=2010;
      date=1;
      System.out.println ("American format:");
      System.out.print (day);
      System.out.print (", ");
      System.out.print (month);
      System.out.print (" ");
      System.out.print (date);
      System.out.print (", ");
      System.out.println (year);
      System.out.println ("European Format:");
      System.out.println (day+" "+date+" "+month+", "+year);
   }
}
