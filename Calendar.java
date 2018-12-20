public class Calendar {

    public static final int MONTH_VALUE1 = 28;
    public static final int MONTH_VALUE2 = 29;
    public static final int MONTH_VALUE3 = 30;
    public static final int MONTH_VALUE4 = 31;
    public static final int NUMBER_OF_MONTH = 12;

    public static String checkNextDate(int d, int m, int y){
        int maxDayInMonth = 0;
        int nextDay = d + 1;
        if((d > 0 && d <= MONTH_VALUE4) && (m > 0 && m <= NUMBER_OF_MONTH) && y>0){
                switch (m){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12: maxDayInMonth = MONTH_VALUE4; break;
                    case 4:
                    case 6:
                    case 9:
                    case 11: maxDayInMonth = MONTH_VALUE3; break;
                    case 2: if(isLeapYear(y)){
                        maxDayInMonth = MONTH_VALUE2;
                    }else{
                        maxDayInMonth = MONTH_VALUE1;
                    }
                }

                if(d + 1 > maxDayInMonth && m != NUMBER_OF_MONTH){
                    nextDay = 1;
                    m++;
                }
                else if (d + 1 > maxDayInMonth && m ==NUMBER_OF_MONTH){
                    nextDay = 1;
                    m = 1;
                    y++;
                }
                String str = String.valueOf(nextDay) + "/" + String.valueOf(m) + "/" + String.valueOf(y);
                return str;
        }else{
            Printer.printMsg("Ошибка при вводе значений!");
        }
        return "0";
    }
    public static boolean isLeapYear(int y){
        if(y % 4 == 0 && y % 100 == 0 && y % 400 == 0){
            return true;
        }
        else if(y % 4 == 0 && y % 100 == 0){
            return false;
        }else{
            return true;
        }
    }
}
