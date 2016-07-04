class IsTriangle {

   // the method:
   public static String isTriangle (int a, int b, int c) {
      if ((a+b)>c || (b+c)>a || (c+a)>b ){
         if (a>0 && b>0 && c>0){
            return ("true");
         }else{
            return ("Pls. try with positive integers only.");
         }
      }else{
         return ("false");
      }
   }

   public static void main (String [] args) {
       String try1 = isTriangle (3,4,5);
       System.out.println (try1);
   }
}
