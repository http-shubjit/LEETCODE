import java.util.Scanner;

/**
 * Compare2dPoints
 */
public class Compare2dPoints {
    public static void main(String[] args) {

        double x1, y1, x2, y2, x3, y3;
        Scanner scan = new Scanner(System.in);
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        x3 = scan.nextDouble();
        y3 = scan.nextDouble();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Point p3 = new Point(x3, y3);
        Point higest = pointWithHighestOriginDistance(p1, p2, p3);
        System.out.println(higest.x+" "+higest.y);

    }

    static Point pointWithHighestOriginDistance(Point p1, Point p2, Point p3) {
        double h1 = Math.sqrt(p1.x * p1.x + p1.y * p1.y);
        double h2 = Math.sqrt(p2.x * p2.x + p2.y * p2.y);
        double h3 = Math.sqrt(p3.x * p3.x + p3.y * p3.y);
        return h1 > h2 ? (h1 > h3 ? p1 : p3) : (h2 > h3 ? p2 : p3);    
   }

    
}

class Point {
    double x, y;

    Point(double x,double y)
    {
        this.x = x;
        this.y = y;
    }
    
}