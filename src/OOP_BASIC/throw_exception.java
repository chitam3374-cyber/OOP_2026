package OOP_BASIC;

class Trianglelim{
    private   int a;
    private  int b;
    private  int c;
    public Trianglelim(int a,int b,int c){
        if((a>0)&&(b>0)&&(c>0)){
            this.a=a;
            this.b=b;
            this.c=c;

        }
        else{
            throw new IllegalArgumentException("THE LENGTH IS ERROR");
        }
    }
    // tạo method xác định xem có phải là tam giác hay không từ đó sẽ trả về kết quả theo yêu cầu bài toán
    public void identifytriagnle(){
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
                System.out.println("Triangle is a triangle");
            }
        }
        else {
            System.out.println("This is not a triangle");
        }
    }
}
public class throw_exception {
    public static void main(String[] args) {
        Trianglelim triangle = new Trianglelim(3,4,5);
        triangle.identifytriagnle();
        Trianglelim triangle2 = new Trianglelim(3,3,5);
        triangle2.identifytriagnle();
        Trianglelim triangle3 = new Trianglelim(3,3,3);
        triangle3.identifytriagnle();
        // tạo phép thử với try và catch nếu đúng thì in ra kiểm tra tam giác
        // nếu sai nó sẽ in ra dòng báo lỗi ở constructor và sẽ hủy toàn bộ chu trình phía sau
        try {
            Trianglelim triangle4 = new Trianglelim(-2, 3, 3);
            triangle4.identifytriagnle();
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}