package LAB_OOP;
class Animal{
    private  String name;
   public Animal(String name){
       this.name=name;
   }
   public String toString(){
       System.out.print(this.name);
       return "";
   }

}
 class Mammal extends Animal{
    public Mammal(String name){
        super(name);
    }
    @Override
    public String toString(){
        super.toString();
        return"";
    }
}
class Cat  extends Mammal{
    public Cat(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Meow");
    }
    @Override
    public String  toString(){
        super.toString();
        return"";
    }
}
class Dog extends Mammal{
    public Dog(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Woof");

    }
    public void greets(Dog another){
        System.out.println("Wooof");
    }
    @Override
    public String  toString(){
        super.toString();
        return"";
    }
}
public class TestcodeProblem1 {
    public static void main(String [] args){
        Cat c1=new Cat("Cat");
        Dog d1=new Dog("Dog");
        Dog d2=new Dog("Dog");
        System.out.println(c1.toString());
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        Animal a1=new Cat("Kitty");
        Animal a2=new Dog("Buddy");
        Animal [] animals=new  Animal[5];
        animals[0]=a1;
        animals[1]=a2;
        for (int i=0;i<animals.length;i++){
            if(animals[i]!=null) {
                System.out.println(animals[i].toString());
            }
        }

    }
}
