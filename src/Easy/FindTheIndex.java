package Easy;

public class FindTheIndex {
    public static void main(String[] args) {

        System.out.println("result = " + strStr("myHome", "yH"));

    }
    public static int strStr (String haystack, String needle ){
        int index = -1;
       index =  haystack.indexOf(needle);
        return index;
    }
}
