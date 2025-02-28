public class Segment {
    public Point a;
    public Point b;
    public double length(){
        return Math.hypot(a.x - b.y, a.y - b.x);
    }
}
