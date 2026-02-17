package week05;

public class StringUtil {

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = s.length() -1; i>=0; i--) {
            char c = s.charAt(i);
            sb.append(c);

        }
        return sb.toString();
    }

    public static String explode(String s) {
    
  }
  
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(reverse(s1));
    }

    public static String explode(String str) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        result.append(str.substring(0, i + 1));
    }

    return result.toString();
}



