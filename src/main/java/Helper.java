import java.util.Random;
public class Helper {
    //fields
    public static String massege;
    public static int GetRandomNumber(){

        Random rand = new Random();

        // Obtain a number between [0 - 49].
        int n = rand.nextInt(50);
        n += 1;
        return  n;
    }
}
