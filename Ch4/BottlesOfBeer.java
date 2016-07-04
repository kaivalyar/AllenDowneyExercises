class BottlesOfBeer {

   public static void invoke (int n) {
      if (n>2) {
         printNormal (n);
         invoke (n-1);
      } else if (n==1) {
         printOne ();
         invoke (n-1);
      } else if (n==0) {
         printZero ();
      } else if (n==2){
         printTwo();
         invoke (n-1);
      } else {
      }
   }


   public static void printTwo () {
      System.out.println ("2 bottles of beer on the wall, 2 bottles of beer, ya' take one down, ya' pass it around, 1 bottle of beer on the wall.");
   }

   public static void printNormal (int x) {
      System.out.println (x + " bottles of beer on the wall, " + x + " bottles of beer, ya' take one down, ya' pass it around, " + (x-1) + " bottles of beer on the wall.");
   }

   public static void printZero (){
      System.out.println ("No bottles of beer on the wall, no bottles of beer, ya' can't take one down, ya' can't pass it around, cause ther are no more  bottles of beer on the wall!");
   }

   public static void printOne (){
      System.out.println ("1 bottle of beer on the wall, 1 bottle of beer, ya' take it down, ya' pass it around, no bottles of beer on the wall.");
   }

   public static void main (String [] args){
      invoke (99);
   }
}
