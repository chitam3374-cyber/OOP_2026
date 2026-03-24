package LAB_OOP;
class point{
    private int x;
    private int y;
    public point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    // từ một object này tới một object khác nên dùng tới other
    //
    public double distance( point other){
        return Math.sqrt(Math.pow(other.x-x,2)+Math.pow(other.y-y,2));
    }

}
public class Distance_test {
    public static void main(String[] args) {
        point p1=new point(1,1);
        point p2=new point(2,2);
        System.out.println(p1.distance(p2));
    }
}
