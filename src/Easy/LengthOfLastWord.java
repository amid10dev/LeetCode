package Easy;

public class LengthOfLastWord {
    public static void main(String[] args) {

    }

    public static int lengthOfLastWord(String s) {
        String[] array = s.split(" ");
        return array[array.length-1].length();
    }
}
