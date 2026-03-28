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
    public static Person findByname(ArrayList<Person>mem, String name){
        for (Person p:mem){
            if (p.getName().equals(name)){
                return p;
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


    }
}
