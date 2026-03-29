package LAB_OOP;
import java.util.ArrayList;
class SchoolDirectionary{
    private final  String DirectoryName;
    ArrayList<Person>members;
    public SchoolDirectionary(String DirectoryName){
        this.DirectoryName = DirectoryName;
        members=new  ArrayList<>();
    }
    public void addPerson(Person p){
        members.add(p);
    }
    public int countStudent(){
        int count=0;
        for (Person p:members){
            if (p instanceof student){
                count++;
            }
        }
        return count;
    }
    public int countStaff(){
        int count=0;
        for (Person p:members){
            if (p instanceof staff){
                count++;
            }
        }
        return count;
    }
    public double totalStudentFee() {
        double total = 0;
        for (Person p : members) {
            if (p instanceof student) {
                total += ((student) p).getFee();
            }
        }
        return total;
    }
    public double totalStaffPay() {
        double total = 0;
        for (Person p : members) {
            if (p instanceof staff) {
                total += ((staff) p).getPay();
            }
        }
        return total;
    }
    // dùng một mảng duyệt đây được gọi là tìm kiếm tuyến tính linear search
    //
    public  Person findByname( String name){
        for (int i=0; i<members.size(); i++){
            Person c=members.get(i);
            if (c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }
    public void printAllMember(){
        for (Person p:members){
            System.out.println(p);
        }
    }

    public String toString(){
        return "Directoryname:"+DirectoryName+
        "totalMember:"+members.size();
    }

}

public class TestcodeProblem5 {
     static void main(String[] args){
         Person p1= new student("Tran Hoang Yen Vy","abcxyz", "BIOLOGICAL TECHNOLOGY", 2026, 450000);
         Person p2= new student("Chung Chi Tam"," 34 duong s3", "INFORMATION TECHNOLOGY", 2026, 25_000);
         Person p3= new staff("To Hao Thanh","27 duong cu xa ", "IU", 500000);
         Person p4= new staff("Nguyen Thanh Hien", "48 duong so 5", "us", 700000);
         SchoolDirectionary sd=new SchoolDirectionary("INTERNATIONAL UNIVERSITY");
         sd.addPerson(p1);
         sd.addPerson(p2);
         sd.addPerson(p3);
         sd.addPerson(p4);
         sd.printAllMember();
         System.out.println("countStudent:"+sd.countStudent());
         System.out.println("countStaff:"+sd.countStaff());
         System.out.println("totalStudentFee:"+sd.totalStudentFee());
         System.out.println("totalStaffPay:"+sd.totalStaffPay());
         System.out.println("Find result:"+sd.findByname("Tran Hoang Yen Vy"));
         System.out.println("Find result:"+sd.findByname("Chung Chi Tam"));







    }
}
