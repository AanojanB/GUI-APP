import javax.swing.JOptionPane; //Importing Javax Swing

public class App { //Name of the file
    public static void main(String[] args) throws Exception { //The main method
        String name = JOptionPane.showInputDialog("Enter your name "); //Declaring variable as a String, assigning value, and showing a message
        JOptionPane.showMessageDialog(null, "Oh Hello.. " + name); //Shows response to the input
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are ya?"));//Declaring variable integer, assigning value, and showing a message
        JOptionPane.showMessageDialog(null, "Oh wow! you're only " +age + " years old??");//Shows response to the input 
        int elephant = JOptionPane.showConfirmDialog(null, "Is it true that elephant's are mammals?", "True or False", JOptionPane.YES_NO_OPTION); //Delcaring variable as integer, assignin value with input of yes or no, yes being 0 and no being 1, shows question
        while ( elephant != JOptionPane.YES_OPTION) { //If variable isn't the yes go into while loop
            JOptionPane.showMessageDialog(null, "That is incorrect!"); //Show message sayin its incorrect
            elephant = JOptionPane.showConfirmDialog(null, "Is it true that elephant's are mammals?", "True or False", JOptionPane.YES_NO_OPTION); //Ask the question and be able reassign value to variable           
        }
        JOptionPane.showMessageDialog(null, "Congraluations, It is true that elephants are mammals!");//Shows this message if not in loop
        GuessNumber.game(); //Calling the method called game from the class file GuessNumber
    }
}