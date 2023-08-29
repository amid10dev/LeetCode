package Easy;

import java.io.IOException;

public class MySqrt {
    public static void main(String[] args)  {

        System.out.println(mySqrt(8));

    }
    public static int mySqrt(int x) {
        int result = 0;
        if (x > 0 && x < (Math.pow(2, 31)) - 1) {
           result = (int) Math.sqrt(x);
        } 
        return result;
    }

}