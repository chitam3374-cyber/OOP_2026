package LAB_OOP;
class Person{
private String name;
private String address;
public Person(String name, String address){
    this.name=name;
    this.address=address;
}
// Method
public  String getName(){
    return name;
}
public String getAddress(){
    return address;
}
public void setAddress(String address){
    this.address=address;
}
public String toString(){
    return "Name:" +name+" "+" Address:"+address;
}
}
class student extends Person{
    private String program;
    private int year;
    private double fee;
    public student(String name, String address, String program, int year, double fee){
        super(name,address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }
    public String getProgram(){
        return program;
    }
    public int getYear(){
        return year;
    }
    public double getFee(){
        return fee;
    }
    public void setProgram(String program){
        this.program=program;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setFee(double fee){
        this.fee=fee;
    }
    @Override
    public String toString(){
        return super.toString()+" Program:"+program+" Year:"+year+" Fee:"+fee;
    }
}
class staff extends Person{
    private String school;
    private double pay;
    public staff(String name, String address, String school, double pay){
        super(name,address);
        this.school=school;
        this.pay=pay;
    }
    public String getSchool(){
        return school;
    }
    public double getPay(){
        return pay;
    }
    public void setSchool(String school){
        this.school=school;
    }
    public void setPay(double pay){
        this.pay=pay;
    }
    @Override
    public String toString(){
        return super.toString()+" School:"+school+" Pay:"+pay;
    }
}
public class TestcodeProblem4 {
    public static void main(String[] args){

 Person p1= new student("Chung Chi Tam","34 S3","IT",2026,22500.7);
 Person p2= new student("Truong The Vinh", "Bconsuoitien","IT",2026,27000.7 );
 Person p3= new staff("To Hao Thanh","27 duong cu xa ", "IU", 500000);
 Person p4= new staff("Nguyen Thanh Hien", "48 duong so 5", "us", 700000);
        ArrayList<Person>persons=new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        for(Person p:persons){
            System.out.println(p);
        }
        // ép class
        student s= (student) p1;
        s.setProgram("BA");
        staff m= (staff) p3;
        m.setSchool("HCMUT");
        System.out.println("AFTER UPDATE:");
        for (Person p:persons){
            System.out.println(p);
        }









    }
}
