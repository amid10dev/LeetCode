package Easy;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        String s1 = "III";
        String s2 = "MCMXCIV";
        String s3 = "XXX";
        System.out.println(romanToInt(s1));
    System.out.println( romanToInt(s2));
     System.out.println( romanToInt(s3));
    }

    public static int romanToInt(String s) {
        char[] str = s.toCharArray();
        int result = 0;
        for (int i = 0; i < str.length; i++) {
            switch (str[i]) {
                case 'I':
                    try {
                        if ((str[i + 1] == 'V') || (str[i + 1] == 'X')) {
                            result -= 1;
                            break;
                        }
                    } catch (Exception ex) {
                    }
                    result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    try {
                        if ((str[i + 1] == 'L') || (str[i + 1] == 'C')) {
                            result -= 10;
                            break;
                        }
                    } catch (Exception ex) {
                    }
                    result += 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                   try{
                       if ((str[i + 1] == 'D') || (str[i + 1] == 'M')) {
                           result -= 100;
                           break;
                       }
                   }catch (Exception ex){

                   }
                    result += 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
        }
        return result;
    }
}
