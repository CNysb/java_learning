import java.util.Random;



public class randomTest{
    public static void main(String[] args){
        Random rd = new Random();
        int number = rd.nextInt(10);
        System.out.println("random number" + number);

    }
}
