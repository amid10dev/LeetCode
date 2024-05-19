package Easy;

public class IntToRoman {
    public static void main(String[] args) {

        //System.out.println(349 / 100);
        System.out.println(intToRoman(2345));

    }

    public static String intToRoman(int num) {
        StringBuilder builder = new StringBuilder();
        int result = 0;

        result = num / 1000;
//        for (int i = 0; i < result; i++) {
//            builder.append("M");
//        }
        switch (result) {
            case 1:
                builder.append("M");
                break;
            case 2:
                builder.append("MM");
                break;
            case 3:
                builder.append("MMM");
                break;
        }

        num = num % 1000;
        result = num / 100;
        switch (result) {
            case 1:
                builder.append("C");
                break;
            case 2:
                builder.append("CC");
                break;
            case 3:
                builder.append("CCC");
                break;
            case 4:
                builder.append("CD");
                break;
            case 5:
                builder.append("D");
                break;
            case 6:
                builder.append("DC");
                break;
            case 7:
                builder.append("DCC");
                break;
            case 8:
                builder.append("DCCC");
                break;
            case 9:
                builder.append("CM");
                break;
        }
        num = num % 100;
        result = num / 10;
        switch (result) {
            case 1:
                builder.append("X");
                break;
            case 2:
                builder.append("XX");
                break;
            case 3:
                builder.append("XXX");
                break;
            case 4:
                builder.append("XL");
                break;
            case 5:
                builder.append("L");
                break;
            case 6:
                builder.append("XL");
                break;
            case 7:
                builder.append("XLL");
                break;
            case 8:
                builder.append("VIII");
                break;
            case 9:
                builder.append("XC");
                break;
        }
        num = num % 10;
        result = num;
       // System.out.println(num);
        switch (result) {
            case 1:
                builder.append("I");
                break;
            case 2:
                builder.append("II");
                break;
            case 3:
                builder.append("III");
                break;
            case 4:
                builder.append("IV");
                break;
            case 5:
                builder.append("V");
                break;
            case 6:
                builder.append("VI");
                break;
            case 7:
                builder.append("VII");
                break;
            case 8:
                builder.append("VIII");
                break;
            case 9:
                builder.append("IX");
                break;
        }

        return builder.toString();
    }
}
