package LAB_OOP;

import java.util.Random;
import java.util.Scanner;

// class xúc xắc
class Dice{
    private int value;

    public void roll(){
        Random rand = new Random();
        value = rand.nextInt(6) + 1;
    }
    // method lấy giá trị
    public int getValue(){
        return value;
    }
}


// class người chơi
class Player{
    private int money;

    public Player(int money){
        this.money = money;
    }

    public int getMoney(){
        return money;
    }

    public void win(int bet){
        money += bet;
    }

    public void lose(int bet){
        money -= bet;
    }
}


// class game
class Game{

    private Player player;
    private Player house;

    private Dice d1;
    private Dice d2;
    private Dice d3;

    public Game(int playerMoney,int houseMoney){
        player = new Player(playerMoney);
        house = new Player(houseMoney);

        d1 = new Dice();
        d2 = new Dice();
        d3 = new Dice();
    }

    public void play(){

        Scanner sc = new Scanner(System.in);

        while(player.getMoney() > 0 && house.getMoney() > 0){

            System.out.println("Your money: " + player.getMoney());

            System.out.print("Enter bet: ");
            int bet = sc.nextInt();

            System.out.println("Choose:");
            System.out.println("1. Big (Tai)");
            System.out.println("2. Small (Xiu)");

            int choice = sc.nextInt();

            d1.roll();
            d2.roll();
            d3.roll();

            int v1 = d1.getValue();
            int v2 = d2.getValue();
            int v3 = d3.getValue();

            int sum = v1 + v2 + v3;

            System.out.println("Dice: " + v1 + " " + v2 + " " + v3);
            System.out.println("Sum: " + sum);

            if(v1 == v2 && v2 == v3){
                System.out.println("Triple! You lose.");
                player.lose(bet);
                house.win(bet);
                continue;
            }

            boolean win = false;

            if(sum >= 4 && sum <= 10 && choice == 1){
                win = true;
            }

            if(sum >= 11 && sum <= 17 && choice == 2){
                win = true;
            }

            if(win){
                System.out.println("You win!");
                player.win(bet);
                house.lose(bet);
            }
            else{
                System.out.println("You lose!");
                player.lose(bet);
                house.win(bet);
            }

        }

        if(player.getMoney() <= 0){
            System.out.println("You ran out of money!");
        }
        else{
            System.out.println("House ran out of money!");
        }

    }

}


// class test
public class BigSmallGame{

    public static void main(String[] args) {

        Game game = new Game(100,1000);
        game.play();

    }

}
