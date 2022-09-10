import java.util.Scanner;

public class HelloWorld2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("first code ");
        int a = sc.nextInt();

        System.out.println("second code ");
        int b = sc.nextInt();

        System.out.println("sum is " + (a+b));


        sc.close();

    }
}
