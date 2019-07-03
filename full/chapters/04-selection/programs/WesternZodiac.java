import java.util.*;

public class WesternZodiac {
    public static void main(String[] args) {                
        Scanner in = new Scanner(System.in);      
        System.out.print("Please enter a month number (1-12): ");
        int month = in.nextInt();
        System.out.print("Please enter a day number in that month (1-31): ");
        int day = in.nextInt();
        String sign = "";
        switch(month) {
            case 1: if(day < 20)
                    sign = "Capricorn";
                else
                    sign = "Aquarius";
                break;
            case 2: if(day < 20)
                    sign = "Aquarius";
                else
                    sign = "Pices";
                break;
            case 3: if(day < 20)
                    sign = "Pices";
                else
                    sign = "Aries";
                break;
            case 4: if(day < 20)
                    sign = "Aries";
                else
                    sign = "Taurus";
                break;
            case 5: if(day < 21)
                    sign = "Taurus";
                else
                    sign = "Gemini";
                break;
            case 6: if(day < 21)
                    sign = "Gemini";
                else
                    sign = "Cancer";
                break;
            case 7: if(day < 23)
                    sign = "Cancer";
                else
                    sign = "Leo";
                break;
            case 8: if(day < 23)
                    sign = "Leo";
                else
                    sign = "Virgo";
                break;
            case 9: if(day < 23)
                    sign = "Virgo";
                else
                    sign = "Libra";
                break;
            case 10:if(day < 23)
                    sign = "Libra";
                else
                    sign = "Scorpio";
                break;
            case 11:if(day < 22)
                    sign = "Scorpio";
                else
                    sign = "Sagittarius";
                break;
            case 12:if(day < 20)
                    sign = "Sagittarius";
                else
                    sign = "Capricorn";
                break;          
        }   
        System.out.println("The zodiac sign is: " + sign);
    }
}
