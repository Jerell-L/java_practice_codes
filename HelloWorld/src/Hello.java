public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Jerell");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("Ang I am scared of aliens.");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true.");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not supposed to happen.");
        }

        //Ternary Operator = Operand ? Operand : Operand
        //Shortcut of If Then Else statement
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country.");
        }

        String s = (isDomestic) ? "This car is domestic." : "This car is not domestic.";
        System.out.println(s);

        double firstNumber = 20.00;
        double secondNumber = 80.00;
        double thirdNumber = ((firstNumber + secondNumber) * 100.00);
        System.out.println("Total: " + thirdNumber);
        double theRemainder = thirdNumber % 40.00;
        System.out.println("The remainder: " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder){
            System.out.println("Got some remainder.");
        }


        }
    }

