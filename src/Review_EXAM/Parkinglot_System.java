package Review_EXAM;
class vehicle{
    private int vehicleID;
    private double hourlyrate;
    public vehicle(int vehicleID,double hourlyrate) {
        if (vehicleID > 0 && hourlyrate > 0) {
            this.vehicleID = vehicleID;
            this.hourlyrate = hourlyrate;
        }
    }
    public double Finalfee(){
        return hourlyrate;
    }

}
class Truck  extends vehicle{
    private double hour;
    public Truck(int vehicleID,double hourlyrate,double hour){
        super(vehicleID,hourlyrate);
       this.hour=hour;
    }
    public double Finalfee(){
        return hour*super.Finalfee()+10;
    }
}
public class Parkinglot_System {
    public static void main(String[] args ){
    }
}

