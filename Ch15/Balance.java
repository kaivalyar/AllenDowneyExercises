import java.util.StringTokenizer;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

//15.4
class Balance {

    private static boolean checkBalance (String s) {
        StringTokenizer st = new StringTokenizer (s, "()[]{} ", true);
        String r = "";
        while (st.hasMoreTokens()) {
            String n = st.nextToken();
            if ( n.trim().equals("(") || n.trim().equals(")") || n.trim().equals("{") || n.trim().equals("}") || n.trim().equals("[") || n.trim().equals("]") ) r+=n;//(n.trim().length() == 1 ) r+=n;
        }
        //System.out.println(r);
        return check(r);
    }

    private static boolean check (String s) {// Helper
        int l = s.length();
        /*if (l == 0) return true;
        else */

        /*if (s.charAt(0) == '(') {
        if (s.charAt(1) == ')') return check(s.substring(2));
        else if (s.charAt(l-1) == ')') return check(s.substring(1, l-1));
        else return false;
        } else if (s.charAt(0) == '[') {
        if (s.charAt(1) == ']') return check(s.substring(2));
        else if (s.charAt(l-1) == ']') return check(s.substring(1, l-1));
        else return false;
        } else if (s.charAt(0) == '{') {
        if (s.charAt(1) == '}') return check(s.substring(2));
        else if (s.charAt(l-1) == '}') return check(s.substring(1, l-1));
        else return false;
        }*/
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push("()");
            else if (s.charAt(i) == '{') stack.push("{}");
            else if (s.charAt(i) == '[') stack.push("[]");
            else if (s.charAt(i) == ')') {
                if (! stack.pop().equals("()")) return false;
            } else if (s.charAt(i) == '}') {
                if (! stack.pop().equals("{}")) return false;
            } else if (s.charAt(i) == ']') {
                if (! stack.pop().equals("[]")) return false;
            }
        }
        return true;
        // Should be switch case... and use another helper method..
    }

    public static void checkFile (String filename) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader (filename);
        BufferedReader in = new BufferedReader (fileReader);
        String r = "";
        while (true) {
            String s = in.readLine();
            if (s == null) break;
            //System.out.println (s);
            r += s;
        }
        System.out.print("This file has ");
        if (! checkBalance(r)) System.out.print("not ");
        System.out.println("been nested correctly.");
    }
}