public class AreaOfRectangle {

    public static void main(String[] args) {
        calculateArea(10.5,5.5);

        calculateArea(11.25,12.3);
    }

    public static void calculateArea(double length, double width){
        double Area = (length * width);
        System.out.println("The Area of the Rectangle is " + Area);
    }
}
