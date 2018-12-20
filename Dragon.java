public class Dragon {
    public static final int FIRST_PERIOD = 200;
    public static final int HEADS_IN_FIRST_PERIOD = 600;
    public static final int SECOND_PERIOD = 100;
    public static final int HEADS_IN_SECOND_PERIOD = 200;

    public static int calculateHeads(int n){
        int heads = 3;
        if(n>=0 && n <= FIRST_PERIOD){
            heads += n * 3;
        }
        else if(n > FIRST_PERIOD && n <= FIRST_PERIOD + SECOND_PERIOD){
            heads += (n - FIRST_PERIOD) * 2 + HEADS_IN_FIRST_PERIOD;
        }
        else{
            heads += (n - FIRST_PERIOD - SECOND_PERIOD) + HEADS_IN_FIRST_PERIOD + HEADS_IN_SECOND_PERIOD;
        }
        return heads;
    }

    public static int calculateEyes(int n){
        return n * 2;
    }
}
