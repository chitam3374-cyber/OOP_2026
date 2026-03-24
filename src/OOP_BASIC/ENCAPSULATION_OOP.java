package OOP_BASIC;
import java.util.Scanner;
class account{
    // encapsulation chir khi dùng method mới gọi được khong
    private String password;
    //
     void setpassword(String pass){
        password=pass;
    }
    String getpassword(){
        return password;
    }
}
public class ENCAPSULATION_OOP {

    public static void main(String[] args) {
        account client1=new account();
        client1.setpassword("helloword");
        System.out.println(client1.getpassword( ));
    }
}
