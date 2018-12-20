public class Sign {
    public static boolean isAlphabetIng(char c){
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
    public static boolean isAlphabetRus(char c){
        return (c >= 'а' && c <= 'я') || (c >= 'А' && c <= 'Я');
    }
    public static boolean isVowelSignFirstWay(char c){
        if(isAlphabetIng(c)){
            char c1 = Character.toLowerCase(c);
            if(c1 == 'a' || c1 == 'e' || c1 == 'u' || c1 == 'o' || c1 == 'i'){
                return true;
            }
        }
        else if(isAlphabetRus(c)){
            char c2 = Character.toLowerCase(c);
            if(c2 == 'у' || c2 == 'е' || c2 == 'ы' || c2 == 'а' || c2 == 'о'|| c2 == 'я' || c2 == 'и' || c2 == 'ю'){
                return true;
            }
        }else {
            return false;
        }
        return false;
    }
    public static boolean isVowelSignSecondWay(char c){
        if(isAlphabetIng(c)){
            char c1 = Character.toLowerCase(c);
            switch (c1){
                case 'a':
                case 'e':
                case 'u':
                case 'o':
                case 'i': return true;
                default: return false;
            }
        }
        else if(isAlphabetRus(c)){
            char c2 = Character.toLowerCase(c);
            switch (c2){
                case 'у':
                case 'е':
                case 'ы':
                case 'а':
                case 'о':
                case 'я':
                case 'и':
                case 'ю': return true;
                default: return false;
            }
        }else {
            return false;
        }
    }
}
