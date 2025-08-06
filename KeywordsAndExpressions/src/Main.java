public class Main {

    public static void main(String[] args) {
        double kilometers = (100 * 1.609344); // Expression is: kilometers = (100 * 1.609344)
        //Entire line of code is called a Statement
        //Data Type and ; are not part of the Expression

        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore; //add bonus points
        }

        int health = 100;
        if ((health < 25) && (highScore > 1000)){
            highScore = highScore - 1000;
        }
    }
}
        /* Expressions are:
        1. health = 100
        2. health < 25
        3. highScore > 1000
        4. (health < 25) && (highScore > 1000)
        5. highScore - 1000
        6. highScore = highScore - 1000 */