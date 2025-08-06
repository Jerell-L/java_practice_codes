public class AreaCalculator {

    public static void main(String[] args) {

        System.out.println(area(5.0)); //First test case
        System.out.println(area(-5.0)); //Second test case
        System.out.println(area(5.0,4.0)); //Third test case
        System.out.println(area(-5.0,4.0)); //Fourth test case
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return (radius * radius) * 3.1415926;
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0){
            return -1.0;
        }
        return x * y;
    }
}