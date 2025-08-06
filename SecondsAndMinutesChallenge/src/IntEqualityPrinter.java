public class IntEqualityPrinter {

    public static void main(String[] args) {
        System.out.println(printEqual(2,2,2));
    }

    public static String printEqual(int x, int y, int z){
        if (x < 0 || y < 0 || z < 0){
            System.out.println("Invalid Value");
        }else if (x == y && x != z || x == z && x != y || y == z && y != x){
            System.out.println("Neither all are equal or different");
        }
        if (x >= 0 && x == y && x == z){
            System.out.println("All numbers are equal");
        }else if (x >= 0 && x != y && y >= 0 && y != z && z >= 0 && z != x){
            System.out.println("All numbers are different");
        }
        return "";
    }
}
