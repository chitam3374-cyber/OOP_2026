package OOP_BASIC;
class car{
    // encapsulation tạo biến đóng chỉ tỏng class sữ dụng
    private String  brand;
    private String model;
    private final String color;
    // dùng chung
    public static String phanloai="xe da dang ki";

    public  car(String brand, String model, String color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
    // method thực hiện dựa trên attribute
    public void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Phan loai xe:"+phanloai);
    }
    // lấy và đặt dữ liệu lại
    // setting and getting
    public  String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String  getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}

public class CARBRANCH_OOP {
    public static void main(String[] args) {
        System.out.println(car.phanloai);
        car xe1= new car("Ford", "2016","black");
    xe1.setBrand("mistumisi");
    xe1.display();
    car xe2= new car("TOYOTA", "2022","GREY");
    xe2.display();
    car xe3=new car("Maybach", "2025","blue");
    xe3.display();
    car xe4= new car("roleroy", "2016","red");
    xe4.display();
    car xe5=new car("Vinfast","VF4","GREEN");
    xe5.setModel("VF8");// ĐỔI DỮ LIỆU MODEL THÔNG QUA METHOD SETMODEL
    xe5.display();
    car xe6=new car("Mustang","2016","red");
    xe6.display();

    }
}
