import java.util.Random;


public class LotteryGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        var number = 0;
        while (number < 6){
            System.out.println(random.nextInt(99));
            number ++;
        }


    }
}
