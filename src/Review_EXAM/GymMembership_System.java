package Review_EXAM;
class Member{
    private int MemberID;
    private double monthly;
    public  Member(int memberID, double monthly) {
        if(memberID <= 0 && monthly <= 0){
            throw new IllegalArgumentException("System is Error");

        }
        this.MemberID = memberID;
        this.monthly = monthly;
    }
    public int getMemberID() {
        return MemberID;
    }
    public double getMonthly() {
        return monthly;
    }

}
class PremiumMember extends  Member{
    private int additional_trainer_fee=30;
    public PremiumMember(int memberID, double monthly, int additional_trainer_fee) {
        super(memberID, monthly);
        this.additional_trainer_fee = additional_trainer_fee;
    }
    public  int getAdditional_trainer_fee() {
        return additional_trainer_fee;
    }
    public void displayMemberINFO(){
        System.out.println(super.getMemberID()+super.getMonthly());
    }
    public void displayPremiumMember() {
        System.out.println(super.getMemberID()+super.getMonthly());
        System.out.println(getAdditional_trainer_fee());
    }

}
public class GymMembership_System {
    public static void  main(String[] args){


    }
}
