public class LuckyNumbers
{
    /* No instance variables */

    /* "empty" constructor with no parameters */
    public LuckyNumbers() { }

    /* Generates a random number between min and max, inclusive,
       and returns that random number
     */
    public int randomIntegerBetween(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    /* Generates and returns a String containing lucky numbers!

       For this lucky number game, there are 5 balls randomly drawn,
       each between 1 and 65, and one "super ball" between 1 and 30.

       In this game, the same number CAN appear more than once.
      */
    public String getLuckyNumbers() {
        int repeat = 5;
        String numbers = "Your lucky numbers are: ";
        while (repeat > 0){
        numbers += randomIntegerBetween(1,65) + ", ";
        repeat --;
        }
        numbers += "the super ball is: " + randomIntegerBetween(1,30);
        return numbers;
    }

}
