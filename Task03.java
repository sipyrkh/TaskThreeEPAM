public class Task03 {
    public static void main(String[] args) {
        int n = InputData.inputInt();
        int countHeads = Dragon.calculateHeads(n);
        int countEyes = Dragon.calculateEyes(countHeads);
        Printer.printMsgAndInt("Количество голов: ", countHeads);
        Printer.printMsgAndInt("Количество глаз: ", countEyes);

        double x1,x2,x3,y1,y2,y3;
        Printer.printMsg("Введите значение первого X: ");
        x1 = InputData.inputDouble();
        Printer.printMsg("Введите значение первого Y: ");
        y1 = InputData.inputDouble();
        Printer.printMsg("Введите значение второго X: ");
        x2 = InputData.inputDouble();
        Printer.printMsg("Введите значение второго Y: ");
        y2 = InputData.inputDouble();
        Printer.printMsg("Введите значение третьего X: ");
        x3 = InputData.inputDouble();
        Printer.printMsg("Введите значение третьего Y: ");
        y3 = InputData.inputDouble();
        boolean isTriangle = Triangle.isTriangle(x1,y1,x2,y2,x3,y3);
        boolean isRightTriangle = Triangle.isRightTriangle(x1,y1,x2,y2,x3,y3);
        Printer.printMsgAndBool("Треугольник существует: ", isTriangle);
        Printer.printMsgAndBool("Треугольник прямоугольный: ", isRightTriangle);

        int faceNumber = MoodFaces.generateNumber();
        String face = MoodFaces.generateFace(faceNumber);
        Printer.printMsg("Ваше настроение сейчас: " + face);

        Printer.printMsg("Введите 3 числа для определения даты: ");
        int date = InputData.inputInt();
        int month = InputData.inputInt();
        int year = InputData.inputInt();
        System.out.println(Calendar.checkNextDate(date, month, year));

        Printer.printMsg("Введите символ: ");
        char sign = InputData.inputChar();
        if(Sign.isVowelSignFirstWay(sign) && Sign.isVowelSignSecondWay(sign)){
            Printer.printMsg("Символ - гласная");
        }else{
            Printer.printMsg("Символ - не гласная");
        }
    }
}