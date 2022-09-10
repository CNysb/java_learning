

public class CreateVariable{
    public static void main(String[] args){
        int heightA = 120;
        int heightB = 130;
        int heightC = 140;
        int tempHeight = heightA> heightB ? heightA: heightB;
        int res = tempHeight > heightC ? tempHeight : heightC;
        System.out.println(res);


    }
}
