import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 5.0;
        p.y = 7.5;

     //   System.out.println(" X = " + p.x + " Y = " + p.y);
        Point p2 = p.translated(2.0, 3.5);
        System.out.println(p);
        System.out.println(p2);
        Segment s1=new Segment();
        s1.a = p;
        s1.b = p2;


    }

}
