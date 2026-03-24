package LAB_OOP;
import java.util.Scanner;
//1.A Triangle uses Point2D objects as attributes because a triangle is defined by three points in a 2D coordinate system.
//2.A triangle is not a point; a triangle has points.
class Triangle2{
    private Point2D P1;
    private Point2D P2;
    private Point2D P3;
    public Triangle2(Point2D P1, Point2D P2, Point2D P3) {
        this.P1 = P1;
        this.P2 = P2;
        this.P3 = P3;
    }
    public double parimeter(){
        double dis1=P1.distance(P2);
        double dis2=P2.distance(P3);
        double dis3=P3.distance(P1);
        return dis1+dis2+dis3;
    }
    public double Area(){
        // herong
        double dis1=P1.distance(P2);
        double dis2=P2.distance(P3);
        double dis3=P3.distance(P1);
        double P=(dis1+dis2+dis3)/2;
        return Math.sqrt(P*(P-dis1)*( P -dis2)*( P -dis3));
    }
    public String toString(){
        return "("+P1+","+P2+","+P3+")";
    }

}
//ANSWER FOR QUESTION 1 IN EXERCISE 1
// Point2D is a class because it represents a point in a two-dimensional space
// defines its attributes (x, y)
// related methods such as move, distance, and isOrigin.
class Point2D{



    //ANSWER FOR QUESTION 2 IN EXERCISE 1
    //attribute
    private int x;
    private int y;

    // constructor
    public Point2D(){
        x=0;
        y=0;
    }
    public Point2D(int x,int y){
        this.x=x;
        this.y=y;
    }
    // constructor giúp copy
    public Point2D(Point2D p){
        this.x=p.x;
        this.y=p.y;
    }
    // Method of class Point 2D
    // Method input
    public void input(){
        // clean code đặt tên object chuẩn inputkhi sữ dụng hàm input
        Scanner input=new Scanner(System.in);
        System.out.println("Enter X coordinate");
        x=input.nextInt();
        System.out.println("Enter Y coordinate");
        y=input.nextInt();
    }
    public void move(double x, double y){
        this.x+=x;
        this.y+=y;
    }
    public boolean isOrigin(){
        if(x==0&&y==0){
            return true;
        }
        return false;
    }
    public double distance(Point2D other){
        // clean code thay vì tạo biến
        return Math.sqrt(Math.pow(x-other.x,2)+Math.pow(y-other.y,2));
    }
    // khác với method trên thì method nyaf chỉ hai điểm bất kì
    // không cố định điểm nào tới điểm nào
    public static double distance(Point2D p1, Point2D p2){
        return Math.sqrt(Math.pow(p2.x-p1.x,2)+Math.pow(p2.y-p1.y,2));
    }
    // trả về tọa độ in ra màn hình
    public String toString(){
        return "("+x+","+y+")";
    }


}
public class Display_Point2D {
    public static void main(String[] args){
        Point2D P1=new Point2D(3,5);
        Point2D P2=new Point2D(2,6);
        Point2D P3=new Point2D(4,7);
        Point2D P4=new Point2D();
        P4.input();
        System.out.println(P4.toString());
        Point2D P5=new Point2D(P4);
        System.out.println(P5.toString());
        P5.move(5,6);
        System.out.println(P5.toString());
        if(P4.isOrigin()){
            System.out.println("normal point2D");
        }
        else{
            System.out.println("origin point2D");
        }














    }

}
