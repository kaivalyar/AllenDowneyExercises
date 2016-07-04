import java.util.Stack;
class Reverse {
    /*
     * Chapter 15 - Stacks
     * 
     * Beginning Chapter exercises, 14.15
     */
    
    //15.1
    public static int[] reverse (int[] ar) {
        Stack s = new Stack();
        for (int i = 0; i < ar.length; i++) {
            s.push(new Integer(ar[i]));
        }
        for (int i = 0; i < ar.length; i++) {
            Integer x = (Integer) s.pop();
            ar[i] = x.intValue();
        }
        return ar;
    }
}
