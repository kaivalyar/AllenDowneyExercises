class Date {
   int year, month, day;


   public Date () {
      this.year = 0;
      this.month = 0;
      this .day = 0;
   }


   public Date (int day, int month, int year) {
      this.day = day;
      this.month = month;
      this.year = year;

   }

   public static void main (String [] args) {
      Date d = new Date(26, 12, 1996);
   }


}
