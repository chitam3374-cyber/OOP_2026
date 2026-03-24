package LAB_OOP;

import java.util.ArrayList;
import java.util.Random;

class particle{
    // Attribute
    private int id;
    private int x;
    private int y;

    // Tạo constructor
    public particle(int id, int x, int y){
        this.id = id;
        this.x = x;
        this.y = y;
    }
    //
    // Method
    // lấy thông tin getter
    public int getId(){
        return this.id;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    // Thay đổi thông tin Setter
    public void setId(int id){
        this.id = id;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }


    // hàm di chuyển của mỗi particle
    public void moveRandom(int width, int height){
        Random rand=new Random();
        x=rand.nextInt(width);
        y=rand.nextInt(height);
    }

    public String toString(){
        return "Particle"+ this.id + " (" + this.x + " )" + this.y;
    }
}
class Box{
    private int width;
    private int height;
    private ArrayList<particle> particles;
    private int nextid=1;
    public Box(int width, int height){
        this.width=width;
        this.height=height;
        particles=new ArrayList<>();
    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    // cần số lượng particle muốn add
    public void  addParticle(int n){
        // tạo object rand và cái particle khi add sẽ có vị trí ngẫu nhiên
        Random rand=new Random();
        for (int i=0;i<n;i++){
            int x=rand.nextInt(width);
            int y=rand.nextInt(height);
            particle p=new particle(nextid++,x,y);
            particles.add(p);
        }
    }
    // SELECTION SORT SẮP XẾP CÁC PARTICLE

    // duyệt qua từng partilce trong dãy particles
    public void moveallparticle(){
        for(int i=0;i<particles.size();i++){
            particle p=particles.get(i);
            p.moveRandom(width,height);
        }
    }
    //chạy 2 vòng for rồi so sánh xem nếu trùng thì tảo a điểm mới điểm đó phải có vị trí ngẫu nghiên
    public void detectcollision(){
        Random rand=new Random();
        for  (int i=0;i<particles.size();i++){
            particle p=particles.get(i);
            for(int j=1;j<particles.size();j++){
                particle p2=particles.get(j);
                if(p.getX()==p2.getX()&&p.getY()==p2.getY()){
                    int x=rand.nextInt(width);
                    int y=rand.nextInt(height);
                    particle newParticle= new particle (nextid++,x,y);
                    particles.add(newParticle);
                }
            }
        }
    }
    // trả về số lượng phần tử của arraylist
    public int numberofparticle(){
        return particles.size();
    }
    public String toString() {
        String result = "";

        // nối thông tin từng particle
        for (particle p : particles) {
            result += p + "\n";
        }

        return result;
    }
}
public class Particle_test {
    public static void main(String[] args) {
        Box box = new Box(10, 10);
        box.addParticle(3);


    }
}
