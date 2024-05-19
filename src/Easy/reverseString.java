package Easy;

public class reverseString {
    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
       reverseString(s);
        System.out.println(s);
    }

    public static void reverseString(char[] s) {

        char[] result = new char[s.length];
        int n = s.length-1;
        for(int i = 0; i < s.length; i++){
            result[n] = s[i];
            n--;
        }
        for (int i = 0; i < result.length; i++) {
            s[i] = result[i];
        }

    }
}
