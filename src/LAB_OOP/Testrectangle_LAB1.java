package LAB_OOP;

class rectangle{
    private int width;
    private int height;
    // chỉ cái nào âm mới sữa thành 1 và in ra lỗi trên màn hình
    public  rectangle(int w,int h){
        if(w<0){
            System.out.println("ERORR");
            this.width=1;// nếu biến width cảu object bé hơn 0 thì sẽ chuyển thành 1 tức là false theo boolean
        }
        else{
            this.width=w;
        }
        if(h<0){
            System.out.println("ERORR");
            this.height=1;
        }
        else{
            this.height=h;
        }
    }
    public void display (){
        System.out.println("width:"+width+"height:"+height);
    }
    public int getwidth(){
        return width;
    }
    public int getheight(){
        return height;
    }
    public void visuallize(){
        for (int x=0;x<this.height;x++){
            for(int y=0;y<this.width;y++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
// phân biệt biến của object và tham số của constructor
//bới constructor chỉ mượn và xét điều kiện để trả về biến private của từng object
// trong trường hợp này tham số của constructor nếu âm thì nó sẽ cho biến cuar object đó là 1
public class Testrectangle_LAB1 {
    public  static void main(String[] args) {

        rectangle rc1 = new rectangle(1, 1);
        rectangle rc2 = new rectangle(-3, 5);
        rectangle rc3 = new rectangle(9, 10);
        System.out.println("the model rc1:");
        rc1.visuallize();
        System.out.println();
        System.out.println("the model rc2:");
        rc2.visuallize();
        System.out.println();
        System.out.println("the model rc3:");
        rc3.visuallize();

    }
}
