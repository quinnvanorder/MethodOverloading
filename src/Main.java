public class Main {
    public static void main(String[] args) {

        int newScore = calculateScore("Quinn", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(1,1));
        System.out.println(calcFeetAndInchesToCentimeters(135));
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static void calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
    }

    public static void calculateScore(){
        System.out.println("No player name, no player score");
    }

    /*
    CHALLENGE TIME!!
    Create a method called calcFeedAndInchesToCentimeters, it needs to have to parameters. Feet is the first parameter,
    inches is the second parameter.

    You should validate that the first parameter feet is >= 0. You should validate that the 2nd parameter inches is >=0
    and <= 12. Return -1 from the method if either of the above is not true.

    If the parameters are valid, then calculate how many centimeters comprise the feet and inches passed to this method
    and return that value.

    Create a 2nd method of the same name but with only one parameter inches. Validate that it is >=0 and return -1 if
    not. If valid, calculate how many feet are in the inches. Call the other overloaded method passing the correct feet
    and inches.

    HINTS: use double for your number datatype. See reference link to check calculations
    ( https://www.metric-conversions.org/length/feet-to-centimeters.htm )
    Calling overloaded methods
    just requires using the right parameters.

     */

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if ((inches < 0 || inches > 12) || feet < 0){
            return -1;
        }
        else {
            return ((feet * 12) + inches) / 0.39370;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if (inches < 0){
            return -1;
        }
        else {
            return calcFeetAndInchesToCentimeters((inches / 12), (inches % 12));
        }
    }
}
