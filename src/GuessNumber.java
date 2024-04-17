import javax.swing.JOptionPane; //Importing Javax Swing
import java.util.*; //Importing java util

public class GuessNumber { //Name of file
    public static void game() { //Creating a method
        Random random=new Random(); //Using imported function
        int guess = 0; //Declaring variable and assigning value
        int min = 1; 
        int max = 100; //Assigning value as 100 to have the upper bound be 100
        int rng = random.nextInt(max-min+1); //Creating random number with the upper bound being 100 and lower bound being 1
        JOptionPane.showMessageDialog(null, rng);

        while (guess != rng) { //While the guess number is not the random number stay in the loop
            guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1 - 100")); //Show message for the input of a number
            if (guess > rng){ //If the guess is greater than the random number display a message saying the guess is higher than the random number
                JOptionPane.showMessageDialog(null, guess + ", Is higher than the actual number");
            }
            else if (guess < rng) {//If the guess is less than the random number display a message saying the guess is lower than the random number
                JOptionPane.showMessageDialog(null, guess + ", Is lower than the actual number");
            }
        }
        JOptionPane.showMessageDialog(null, "You have guessed the right number!"); //If you guessed correctly display this message
    }
}
