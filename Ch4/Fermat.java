class Fermat{

   public static void checkFermat (int a, int b, int c, int n) {
      if (n<=2) {
         System.out.println ("Pls. input a power greater than 2, here 3 will be chosen");
         checkFermat (a,b,c,3);
      } else {

// it was assumed that raiseToPow doesn't exist and was hence, replaced by Math.pow

         int x = (int) Math.pow (a,n);
         int y = (int) Math.pow (b,n);
         int z = (int) Math.pow (c,n);

         if (x+y==z) {
            System.out.println ("Holy smokes, Fermat was wrong!");
         } else {
            System.out.println ("No, that doesn't work.");
         }
      }
   }

   public static void main (String [] args ) {

      checkFermat (1,2,3,4);
      checkFermat (2,3,4,5);
      checkFermat (3,4,5,6);
      checkFermat (9,8,7,1);

   }
}
