public class Triangle {
    public static boolean isTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
        double X1 = x2 - x1;
        double Y1 = y2 - y1;
        double X2 = x3 - x2;
        double Y2 = y3 - y2;
        double X3 = x1 - x3;
        double Y3 = y1 - x3;

        double AB = Math.abs(Math.sqrt(Math.pow(X1, 2) + Math.pow(Y1, 2)));
        double BC = Math.abs(Math.sqrt(Math.pow(X2, 2) + Math.pow(Y2, 2)));
        double CA = Math.abs(Math.sqrt(Math.pow(X3, 2) + Math.pow(Y3, 2)));

        if(AB < BC + CA && BC < AB + CA && CA < AB + BC){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isRightTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
        double X1 = x2 - x1;
        double Y1 = y2 - y1;
        double X2 = x3 - x2;
        double Y2 = y3 - y2;
        double X3 = x1 - x3;
        double Y3 = y1 - y3;

        double AB = Math.abs(Math.sqrt(Math.pow(X1, 2) + Math.pow(Y1, 2)));
        double BC = Math.abs(Math.sqrt(Math.pow(X2, 2) + Math.pow(Y2, 2)));
        double CA = Math.abs(Math.sqrt(Math.pow(X3, 2) + Math.pow(Y3, 2)));

        if(AB == Math.sqrt(Math.pow(BC, 2)+ Math.pow(CA, 2)) || BC == Math.sqrt(Math.pow(AB, 2) + Math.pow(CA, 2))
                || CA == Math.sqrt(Math.pow(AB, 2) + Math.pow(BC, 2)) ){
            return true;
        }else{
            return false;
        }
    }
}
