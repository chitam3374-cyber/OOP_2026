package LAB_OOP;
class Triangle{
    private   int a;
    private  int b;
    private  int c;
    public Triangle(int a,int b,int c){

            this.a=a;
            this.b=b;
            this.c=c;

    }
    // tạo method xác định xem có phải là tam giác hay không từ đó sẽ trả về kết quả theo yêu cầu bài toán
    public void verify(){
        if((this.a+this.b>this.c)&&(this.a+this.c>this.b)&&(this.c+this.b>this.a)){
            if((this.a==this.b)||(this.a==this.c)||(this.b==this.c)){
                if((this.a==this.b)&&(this.b==this.c)&&(this.a==this.c)){
                    System.out.println("Triangle is a Equilateral  triangle");
                }
                else {
                    System.out.println("Triangle is a Isosceles triangle");
                }
            }
            else{
                System.out.println("Triangle is a Scalene  triangle");
            }

        }
        else {
            System.out.println("This is not a triangle");
        }
    }
}
public class TriangleVerification_LAB1 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        triangle.verify();
        Triangle triangle2 = new Triangle(3,3,5);
        triangle2.verify();
        Triangle triangle3 = new Triangle(3,3,3);
        triangle3.verify();



    }
}
