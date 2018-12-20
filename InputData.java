import java.util.Scanner;

public class InputData {
    public static Scanner in = new Scanner(System.in);

    public static int inputInt(){

        return in.nextInt();
    }
    public static double inputDouble(){
        return in.nextDouble();
    }
    public static char inputChar(){
        return in.next().charAt(0);
    }
}
