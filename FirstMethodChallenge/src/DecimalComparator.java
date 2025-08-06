public class DecimalComparator {

    public static void main(String[] args) {

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        long a = (long) (firstNumber * 1000);
        long b = (long) (secondNumber * 1000);
        if (a == b){
            return true;
        }else
            return false;
    }
}
