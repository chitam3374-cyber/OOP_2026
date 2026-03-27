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

}

public class TestcodeProblem5 {
     static void main(String[] args){


    }
}
