package Enumeration;

public class main {
    public enum Week{Monday, Teusday, Wednesday, Thursday, Saturday, Sunday}
    public static  void main(String[] args){
//        week w1 = null;
//        Enum w2 = null;


//          name()
        Week today = Week.Sunday;
        String name = today.name();
//        System.out.println(name);

//         ordinal()

        int ordinal = today.ordinal();
//        System.out.println(ordinal);

//        compare()
        Week day1 =Week.Monday;
        Week day2 =Week.Wednesday;

        int result1 = day1.compareTo(day2);
        int result2 = day2.compareTo(day1);
//        System.out.println(result1);
//        System.out.println(result2);

//        valueOf()
        if (args.length ==1){
            String strDay = args[0];
            Week weekDay = Week.valueOf(strDay);
            if (weekDay == Week.Saturday || weekDay == Week.Sunday)
                System.out.println("Weekend");
            else {
                System.out.println("Weekdays");
            }
        }

//        valueof()
        Week[] days = Week.values();
        for (Week day: days){
            System.out.println(day);
        }

    }
}
