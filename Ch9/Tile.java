class Tile{
   char letter;
   int value;

   public Tile (char l, int v) {
      this.letter = l;
      this.value = v;
   }


   public static void printTile (Tile t) {
      System.out.println (t.letter + " " + t.value);
   }

   public static void testTile () {
      Tile t = new Tile('z', 10);
      printTile (t);
   }

   public static void main (String [] args) {
      testTile ();
   }


}
