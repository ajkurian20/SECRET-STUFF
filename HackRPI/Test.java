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
    private int loop = 0; //Equals 1 if you die after passing first round
    private String status = ""; //Determines if player if Alive or Dead

    public String choiceA(){
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
            if (loop == 1){
                System.out.println("(E) Go to the killer's house");
            }
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
            else if (result1.equalsIgnoreCase("E")){
                //Goes to Killer's House (Part II)
            }
            else{
                System.out.println("Please enter a valid option");
            }
        }

    }
}
