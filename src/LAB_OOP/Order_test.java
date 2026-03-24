package LAB_OOP;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
// tạo class đồ vật sẽ có những  thông tin gì liên quan
class Item{
private int id ;
private String name;
private double price;
public  Item(int id,String name,double price){
this.id=id;
this.name=name;
this.price=price;
}

public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
      }
   }

class Order{
    // id khách hàng
    private int id;
    // ArrayList<kiểu dữ liệu> tên biến
    private ArrayList<Item> items;


    // tạo constructor với id
    // items là một mảng động vecto
    public Order(int id){
        this.id=id;
        //tự thêm mới phần tử và không có giới hạn
        this.items=new ArrayList<>();
    }



    // method thêm item
    public void addItem(Item item){
        items.add(item);
    }
    public int numberofitem(){
        return items.size();
    }
    public double calculateAveragecost(){
        if (numberofitem()==0){
            return 0;
        }
        double sum=0;
        // for each để duyệt từng phần tử trong mảng Items
        for(int i=0;i<items.size();i++){
            // món đồ tại vị trí i trong mảng tên items
            Item c=items.get(i);
            sum+=c.getPrice();
        }
        return sum/numberofitem();
    }

}
public class Order_test {
    public static void main(String[] args) {
        Order kt1 = new Order(1893);
        Item c = new Item(123, "com", 2.5);
        Item c2 = new Item(154, "chao", 3.7);
        Item c3 = new Item(155, "ga", 7.5);
        kt1.addItem(c);
        kt1.addItem(c2);
        kt1.addItem(c3);
        System.out.println("Average cost: " + kt1.calculateAveragecost());
    }
}
