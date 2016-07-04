class Time{

      //this is a basic primitive working program meant for being made more sophisticated per exercise

   public static void main (String[] args) {
      int hour, minute, second;
      hour=10;
      minute=30;
      second=30;
      System.out.println(((hour*60*60+(minute*60)+second)*100)/(24*60*60));// compund expression for % of day past
   }
}
