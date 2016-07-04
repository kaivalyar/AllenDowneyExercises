import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

public class Golfer implements java.lang.Comparable{
    String name;
    int score;
    
    public Golfer (String n, String s) {
        this.name = n;
        this.score = Integer.parseInt(s);
    }
    
    public int compareTo (Object c) {// -ve if t < c
        /*if () {
            
        } else if () {
            return 
        } else {
            return 0;
        }*/
        if (c instanceof Golfer) {
            //return 0;
            return (this.score - ((Golfer)c).score);
        } else {
            System.exit(0);
            return 0;
        }
    }
    
    public static void scoreGolfers (String filename) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader (filename);
        BufferedReader in = new BufferedReader (fileReader);
        PriorityQueue pq = new PriorityQueue();
        while (true) {
            String s = in.readLine();
            if (s == null) break;
            else if (s.equals("")) continue;
            s = s.trim();
            int x = s.lastIndexOf(' ');
            String name = s.substring(0, x).trim();
            String score = s.substring(x).trim();
            Golfer g = new Golfer(name, score);
            pq.add(g);
        }
        while (pq.size() > 0) {
            System.out.println(pq.poll());
        }
    }
    
    public String toString() {
        return "\t" + this.name + "\t" + this.score;
    }
    
    public static void main (String[] args) throws FileNotFoundException, IOException {
        scoreGolfers("Golf.java");// Golf.java, though a java file, contains only Golfers and their scores, in a random order
    }
}
