class Test {

   public static void main ( String [] args ) {
      char ch = 'x';
      ch ++;
//      ch = ch +1;
      System.out.println (ch);

/*
      //booleans
//      boolean q=true + false;// operator + cannot be applied
//      boolean w=true + 'a';// operator + cannot be applied
//      boolean e=true + 1;// operator + cannot be applied
//     boolean r=true + "A";// incompatible types

      //chars
//      char t= true + 'a';// operator + cannot be applied
      char y= 'a' + 'a';
      char u= 1 + 'a';
//      char i= "ad" + 'a';// incompatible types

      //ints
//      int p= 1 + true; // operator + cannot be applied
//      int a= 1 + 'a';// operator + cannot be applied
      int s= 1 + 1;
//      int d= 1 + "A";// incompatible types

      //Strings
      String f = "A" + true;
      String g = "A" + 'a';
      String h = "A" + 1;
      String j = "A" + "A";
*/

// now adding print statements to see whether concatenation was performed, or addition
      System.out.println (y); // Â     [*]
      System.out.println (u); // b     [*]
      System.out.println (s); // 2     [addition]
      System.out.println (f); // Atrue [concatenation]
      System.out.println (g); // Aa    [concatenation]
      System.out.println (h); // A1    [concatenation]
      System.out.println (j); // AA    [concatenation]

// *  -------------->        chars, and ascii values need to be understood to explain this.


  }





}
