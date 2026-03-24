package OOP_BASIC;

import java.util.ArrayList;
class User {
    private int iduser;
    private String email;
    private String name;


    public User(int iduser, String email, String name) {
        this.iduser = iduser;
        this.email = email;
        this.name = name;
    }

    public int getIduser() {
        return this.iduser;
    }
    public String  getEmail() {
        return this.email;
    }
    public String getName() {
        return this.name;
    }
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    
}

class ticket{
    private int id;
    private String name;
    private int seatnumber;
    private int price;
    private User user;
    public ticket(int id, String name, int seatnumber, int price, User user ){
        this.id = id;
        this.name = name;
        this.seatnumber = seatnumber;
        this.price=price;
        this.user=user;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getSeatnumber(){
        return this.seatnumber;
    }
    public int getPrice(){
        return this.price;
    }
    public User getUser(){
        return this.user;
    }
}

public class Assigment1 {
    public static void main(String[] args) {
        User u1=new User(100, "chitam@gmail.com", "Chung Chi Tam");
        ticket tk1=new ticket(3206, "batman", 33,10,u1 );
        ticket tk2=new ticket(3207, "boruto", 35,10,u1 );
        System.out.println("Movie:"+tk1.getName());
        System.out.println("Thong tin khach hang:"+tk1.getUser().getName());
      


    }
}
