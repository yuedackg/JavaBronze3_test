public class Main{
    public static void main(String[] args) {
        String str1 = "abcdefghijk";
        String str2 = null;

        switch (str1.charAt(5)) {
            case 'e':
                str2 = "char E";
                break;
            case 'f':
                str2 = "char F";
                break ;
        default:
                str2 = "other";
                break;
        }
    }
}
