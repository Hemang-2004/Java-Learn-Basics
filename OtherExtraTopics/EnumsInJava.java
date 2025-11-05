import java.util.*;
enum Day
{
    SUNDAY(1),MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
    private final int dayNumber;
    Day(int dayNumber)
    {
        this.dayNumber = dayNumber;
    }
    int getDayNumber()
    {
        return this.dayNumber;
    }
}
public class EnumsInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toUpperCase();
        switch(a) 
        {
            case "MONDAY", "TUESDAY" -> System.out.println("Weekday");
            case "SUNDAY" -> System.out.println("WEEKEND");
        }
        // Day day = Day.SUNDAY;

    }    
}

// Now you can
