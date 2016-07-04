import java.util.Stack;

import java.util.StringTokenizer;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Postfix {

    //15.5
    public static String evalPostFix (String ex) {
        StringTokenizer s = new StringTokenizer(ex, " +-*/!%^", true);
        Stack w = new java.util.Stack();
        boolean inLoop = false;
        while (s.hasMoreTokens()) {
            String t = s.nextToken().trim();
            inLoop = true;
            /*System.out.println(t);
            if (t.charAt(0) == '+') {
            Double a = (Double) w.pop();
            double x = a.doubleValue();
            Double b = (Double) w.pop();
            double y = b.doubleValue();
            w.push(new Double(x+y));
            } else if (t.charAt(0) == '-') {
            Double a = (Double) w.pop();
            double x = a.doubleValue();
            Double b = (Double) w.pop();
            double y = b.doubleValue();
            w.push(new Double(x-y));
            } else if (t.charAt(0) == '*') {
            Double a = (Double) w.pop();
            double x = a.doubleValue();
            Double b = (Double) w.pop();
            double y = b.doubleValue();
            w.push(new Double(x*y));
            } else if (t.charAt(0) == '/') {
            Double a = (Double) w.pop();
            double x = a.doubleValue();
            Double b = (Double) w.pop();
            double y = b.doubleValue();
            w.push(new Double(x/y));
            } else if (t.charAt(0) == ' ') {
            //do nothing
            } else {
            w.push(new Double(t));
            }*/
            if (t.isEmpty()) {

            } else if (Character.isDigit(t.charAt(0))) {
                w.push(new Double(t));
            } else if (t.charAt(0) == '.') {// ERROR PROOFING
                    t = "0" + t;
                    w.push(new Double(t));
            } else {
                if (checkEmpty(w)) return ("Oops! It appears you made a Syntax Error, Try Again!");
                Double a = (Double) w.pop();
                double x = a.doubleValue();
                if (checkEmpty(w)) return ("Oops! It appears you made a Syntax Error, Try Again!");
                Double b = (Double) w.pop();
                double y = b.doubleValue();
                if (t.charAt(0) == '+') {
                    w.push(new Double(y+x));
                } else if (t.charAt(0) == '-') {
                    w.push(new Double(y-x));
                } else if (t.charAt(0) == '*') {
                    w.push(new Double(y*x));
                } else if (t.charAt(0) == '/') {
                    w.push(new Double(y/x));
                } else if (t.charAt(0) == '^') {
                    w.push(new Double(Math.pow(y, x)));
                } else if (t.charAt(0) == '%') {
                    w.push(new Double((int)y%(int)x));
                } else if (t.charAt(0) == '!') {
                    w.push(new Double(Math.pow(x, (1.0/y))));
                } else {
                    System.err.println("SYNTAX ERROR");
                    return ("Oops! It appears you made a Syntax Error, Try Again!");
                }
            }
        }
        if (inLoop) {
            Double printResult = ((Double)w.pop());
            if (! w.empty()) {
                System.err.println("SYNTAX ERROR:");
                return ("Too many operands, incomplete expression.");
            }
            return ( printResult.doubleValue() + "");
        }
        else return ("NO ANSWER FOUND");
    }
    
    //15.6)
    public static void main (String[] args) {
        try {
            inputLoop();
        } catch (IOException e) {
            System.err.println("ERROR IN INPUT");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("UNKNOWN ERROR - PLEASE REPORT THE FOLLOWING TO KAIVALYA");
            e.printStackTrace();
        }
    }
    
    private static void inputLoop () throws IOException {
        BufferedReader stdin =
        new BufferedReader (new InputStreamReader (System.in));
        while (true) {
            System.out.print ("\nEnter the postfix expression, using spaces as delimiters (or type \"quit\" to stop):\n\t"); // print a prompt
            String s = stdin.readLine(); // get input
            if (s == null) break;
            if (s.equals("quit")) break;// check if s is "quit"
            System.out.println(evalPostFix(s));// print s
        }
    }
    
    private static boolean checkEmpty(Stack w) {
        if (w.empty()) {// ERROR PROOFING
                    System.err.println("SYNTAX ERROR:");
                    System.err.println("You have specified an operator [or used a non-numeric character] before declaring enough operands, ");
                    System.err.println("and so the expression is not a genuine postfix expression.");
                    return true;
        }
        return false;
    }
}
