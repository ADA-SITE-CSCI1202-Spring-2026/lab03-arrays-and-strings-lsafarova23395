package week05;

import java.util.Arrays;

public class StringUtil {

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            sb.append(c);
        }

        return sb.toString();
    }

    public static String explode(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                char c = s.charAt(j);
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static String sortString(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static void main(String[] args) {
        String s = "Baku";
        System.out.println(sort(s));
    }
}

public static boolean isAnagram(String s1, String s2) {
    String s1 = "Baku";
    String s2 = "akB";

    if (s1.length() != s2.length()) {
        return false;
    }

    char[] arr1 = s1.toCharArray();
    char[] arr2 = s2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    return Arrays.equals(arr1, arr2);
}
public static String swap(String s) {
    StringBuilder sb = new StringBuilder();
    String[] s_array = s.split(regex:"");
    for(int i = 0; i < s_array.length; i++) {
        char[] c = s_array[i].toCharArray();
        char temp = c[0];
        c[0] = c[c.length - 1];
        c[c.length - 1] = temp;
        sb.append(c);
        sb.append(str:" ");
    
    }

    return sb.toString();}




