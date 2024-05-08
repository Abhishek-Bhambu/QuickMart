package in.co.codeplanet.QuickMart.utility;

import java.util.Random;

public class Otp {
    public static String generateOtp(int no_of_digits)
    {
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<no_of_digits;i++)
            sb.append(random.nextInt(0,10));
        return sb.toString();
    }
}
