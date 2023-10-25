public class enums {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        Day today = Day.THURSDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Today is moday!");
                break;
            case TUESDAY:
                System.out.println("Today is tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is wednesday!");
                break;
            case THURSDAY:
                System.out.println("Today is thursday!");
                break;
            case FRIDAY:
                System.out.println("Today is friday!");
                break;
            case SATURDAY:
                System.out.println("Today is saturday!");
                break;
            case SUNDAY:
                System.out.println("Today is sunday!");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}

}
