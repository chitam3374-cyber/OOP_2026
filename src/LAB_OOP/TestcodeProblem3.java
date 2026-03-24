package LAB_OOP;
class shape{
    private String color;
    private boolean filled;
    public shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public shape() {

    }
    // các method cơ bản như get và set
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    // method diện tích cha và method chu vi cha
    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }
    //in ra thông tin chuyển thành chuỗi
    public  String toString(){
        return color+","+filled;
    }
}
class circle extends  shape{
    private double radius;
    public circle(){
        this.radius=0;
    }
    public circle(double radius){
        this .radius=radius;
    }
    public circle(String color, boolean filled,double radius){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*3.14;
    }
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
    @Override
    // mượn method của class cha rồi sữ dụng theo cách khác
    public String toString() {
        return super.toString()+","+radius;
    }

}
class Rectangle extends shape{
    protected double width;
    protected double length;
    public Rectangle(){
        this.width=0;
        this.length=0;
    }
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(String color, boolean filled, double width, double length){
        super(color, filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLegnth() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.width*this.length;
    }
    public double getPerimeter(){
        return 2*(this.width+this.length);
    }
    public String toString(){
        return super.toString()+" "+width+" "+length;// gọi lại hàm toString của class cha
    }
}
 class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(String color, boolean filled,double side) {
        super(color, filled, side, side);
    }
    // Method
     // vì trong hình vuông side=length=width nên chỉ cần trả về width hoặc length
    public double getSide(){
        return this.width;
    }
    // thay đổi cạnh hình vuông thì thay đổi cả chiều dài lẫn chiều rộng
    public void setSide(double in) {
        this.width=in;
        this.length=in;
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);

    }
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    @Override
     public String  toString(){
        return super.toString();
    }

 }
public class TestcodeProblem3 {
    public static void main(String[] args) {

                // Test Shape
                shape s = new shape("red", true);
                System.out.println("Shape: " + s);

                // Test Circle
                circle c = new circle("blue", true, 5);

                System.out.println("Circle: " + c);
                System.out.println("Area: " + c.getArea());
                System.out.println("Perimeter: " + c.getPerimeter());

                // Test Rectangle
                Rectangle r = new Rectangle("green", false, 4, 6);

                System.out.println("Rectangle: " + r);
                System.out.println("Area: " + r.getArea());
                System.out.println("Perimeter: " + r.getPerimeter());
                System.out.println();
                // Test Square
                Square sq = new Square("yellow", true, 3);
                //thực hiện in
                System.out.println("Square: " + sq);
                System.out.println("Area: " + sq.getArea());
                System.out.println("Perimeter: " + sq.getPerimeter());

                // Verify changing side
                System.out.println("\nChange side to 8");
                sq.setSide(8);

                System.out.println("Side: " + sq.getSide());
                System.out.println("Width: " + sq.getWidth());
                System.out.println("Length: " + sq.getLegnth());
                System.out.println();
                System.out.println("Use polymorphism in java");
                //Polymorphism
                shape s1=new circle(10.5);
                shape s2=new Rectangle(12.4,16.5);
                shape s3=new Square(17);
                System.out.println("Print all Area:");
                System.out.println("Shape: " + s1.getArea());
                System.out.println("Shape: " + s2.getArea());
                System.out.println("Shape: " + s3.getArea());
                System.out.println();
                System.out.println("Print all perimeter:");
                System.out.println("Shape: " +Math.ceil( s1.getPerimeter()));
                System.out.println("Shape: " + s2.getPerimeter());
                System.out.println("Shape: " + s3.getPerimeter());

    }
}

