import java.util.Scanner;
/**
 * Write a description of class Test here.
 *
 * @author Brianna, AJ, Luis, Paul, Tesfa
 * @version 11/11/2017
 */
public class Test
{
    //Instance Variables
    private String status = ""; //Determines if player if Alive or Dead

    public String choiceA(){
        System.out.println("You decide to go back to bed");
        System.out.println("After deciding that you have wasted a majority of your time \n in bed, you study until it is luch time \n When you get to the Dinning Hall, do you decide to go in or to get the To-Go option?");
        System.out.println("(A) Dinning Hall \n(B) To-Go");
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        boolean validLetter = false;
        while (!validLetter)
        {
            if (input1.equalsIgnoreCase("A"))
            {
                return "D";
            }   
            else if (input1.equalsIgnoreCase("B"))
            {
                return "AE";
            }
            else
            {
                System.out.println("Enter a valid option");
            }
        }
        return "";
    }

    public String choiceB(){
        return "";
    }

    public String choiceC(){
        return "";
    }

    public String choiceD(){
        return "";
    }

    public void main(String args[]){
        status = "Dead";
        while(status.equals("Dead")){
            Scanner sc = new Scanner(System.in);
            System.out.println("Good morning! You look at the clock and realize that you woke up late!");
            System.out.println("Do you: \n(A) Go back to bed \n(B) Eat food \n(C) Go to the gym \n(D) Work on homework?");
            String result1 = sc.next();
            if (result1.equalsIgnoreCase("A")){
                status = choiceA();
            }
            else if (result1.equalsIgnoreCase("B")){
                status = choiceB();
            }
            else if (result1.equalsIgnoreCase("C")){
                status = choiceC();
            }
            else if (result1.equalsIgnoreCase("D")){
                status = choiceB();
            }
            else{
                System.out.println("Please enter a valid option");
            }
        }
        //End part I, beginning part II (Formal)

        System.out.println("Finally you get to go to the formal with all of your friends.");
        System.out.println("After a couple hours of dancing, you get overheated and go outside");

    }
}
