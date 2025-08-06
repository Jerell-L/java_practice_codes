public class TeenNumberChecker {

    public static void main(String[] args) {

    }
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge);
    }

    public static boolean isTeen(int age) {
        return age > 12 && age < 20;
    }
}
