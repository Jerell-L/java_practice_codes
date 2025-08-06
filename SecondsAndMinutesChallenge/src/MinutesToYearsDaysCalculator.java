public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        System.out.println(printYearsAndDays(561600)); //528480 2 days
    }

    public static String printYearsAndDays(long minutes){
        long XX = minutes;
        long YY = XX / 525600;
        long ZZ = (XX / 1440) % 365;
        if (minutes < 0){
            System.out.println("Invalid Value.");
        }else{
            System.out.println(XX + " min = " + YY + " y and " + ZZ + " d");
        }
        return "";
    }
}
