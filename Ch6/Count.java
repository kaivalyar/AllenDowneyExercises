class Count {

// a)

/*
The method has a parameter but it is useless as it is re-assigned in the first statement. The parameter had to be given because the question specified so, but the question didn't ask to generalise the method, and hence the variable s had to be re-assigned. This was done in the first statement, as per the code fragment.
*/

/*
   public static int count (String s) {
      String s = "((3 + 7) * 2)";
      int len = s.length ();
      int i = 0;
      int count = 0;
      while (i < len) {
         char c = s.charAt(i);
         if (c == '(') {
            count = count + 1;
         } else if (c == ')') {
            count = count - 1;
         }else{
         }
         i = i + 1;
      }
      return (count);
   }
*/


// However, the above didn't work, the parameter had to be removed, resulting in: 

   public static int count (String s) {
      int len = s.length ();
      int i = 0;
      int count = 0;
      while (i < len) {
         char c = s.charAt(i);
         if (c == '(') {
            count = count + 1;
         } else if (c == ')') {
            count = count - 1;
         }else{
         }
         i = i + 1;
      }
      return (count);
   }


//--------------------------------------------------------------------------------------------------------------

/*
// b) The method checks the no. of open braces, and subtracts the no. of closed braces from it. This has the effect of 
checking whether an expression is correct or not (i.e. whether all opened braces are closed, etc.)
*/

// --------------------------------------------------------------------------------------------------------------

/* c)

Presently this method operates only to check the 2 chars '(' and ')' . However these could be replaced by variables 
(parameters), which are specified by the invokation statement of this method.

Therefore, the code would be:

*/
   public static int count (String s, char x, char y) {
// the following line had been removed by the question
//      String s = "((3 + 7) * 2)";
      int len = s.length ();
      int i = 0;
      int count = 0;
      while (i < len) {
         char c = s.charAt(i);
         if (c == x) {
            count = count + 1;
         } else if (c == y) {
            count = count - 1;
         }else{
         }
         i = i + 1;
      }
      return (count);
   }
// p.s this is overloading


// here is main:
   public static void main ( String [] args ) {
      System.out.println (count ("xygrbsfgbl"));
      System.out.println (count ("(x - (y * 2)", '(', ')'));
   }
}
