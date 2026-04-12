package LAB_OOP;
interface Payble{
double calculate();
}
class Teaching_Assistance extends Student implements Payble{
    private double hourlyRate;
    private int workingHour;
    public Teaching_Assistance(String name, String email, String id, String Program, int year, double hourlyRate, int workingHour)
    {
        super(name, email, id, Program, year);
        this.hourlyRate = hourlyRate;
    }
    // tọa hàm getter và setter
    public double gethourlyRate(){
        return hourlyRate;
    }
    public void sethourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    public int getworkingHour(){
        return workingHour;
    }
    public void setworkingHour(int workingHour){
        this.workingHour = workingHour;
    }
    @Override
    public double calculate(){
        return hourlyRate * workingHour;
    }
    @Override
    public String getRole(){
        return "Teaching Assistance";
    }
    @Override
    public String toString(){
        return super.toString()+"Hourlyrate:"+hourlyRate+"workinghour:"+workingHour;
    }
}





public class TestProblem2 {
    public static void main(String [] args){


    }





}
