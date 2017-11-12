import java.util.Scanner;
import java.util.Random;

/**
 * Write a description of class Test here.
 *
 * @author Brianna, AJ, Luis, Paul, Tesfa
 * @version 11/11/2017
 */
public class Test
{
    //Instance Variables
    private static String status = ""; //Determines if player if Alive or Dead
    private static boolean taser = false;
    private static boolean alive = false;
    private static String f1 = "Steve";
    private static String f2 = "Stephanie";
    private static String f3 = "Mike";
    private static String s1 = "Jarred";
    private static String s2 = "Will";
    private static String s3 = "Jean";

    private static String choiceA(){
        System.out.println("You decide to go back to bed");
        System.out.println("After deciding that you have wasted a majority of your time \nin bed, you study until it is luch time \n When you get to the Dining Hall, do you decide to go in or to get the To-Go option?");
        System.out.println("(A) Dining Hall \n(B) To-Go");
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        boolean validLetter = false;
        while (!validLetter)
        {
            if (input1.equalsIgnoreCase("A"))
            {
                System.out.println("In the dining hall, you are sitting under a light fixture that seems slighly wobbly.\nAfter you get your food and sit down, the light fixture falls and you die.\n\nGAME OVER");
                return "D";
            }   
            else if (input1.equalsIgnoreCase("B"))
            {
                System.out.println("You eat your meal and realize that it is almost time to go to the dance.");
                return "AE";
            }
            else
            {
                System.out.println("Enter a valid option");
            }
        }
        return "";
    }

    private static String choiceB(){
        int a = 0;
        while (a == 0){
            Scanner sc = new Scanner(System.in);
            System.out.println("\fYou decide to get some food to eat.");
            System.out.println("You: \n(A) Eat ramen in your room \n(B) Go to the dining hall \n(C) Go to a restaurant off campus");
            String decision1 = sc.next();
            if (decision1.equalsIgnoreCase("A")){ //Eat in Room
                a++;
                System.out.println("\fYou decide to eat in your room. You turn on your TV and see a news report \nabout the increase in muggings in your area.");
            }
            else if (decision1.equalsIgnoreCase("B")){ //Dining Hall
                a++;
                System.out.print("\fYou arrive at the dining hall, but your friends text you and tell you that they just");
                System.out.println(" woke up and will be there in half an hour.");
                System.out.println("You: \n(A) Wait half an hour for your friends \n(B) Sit by yourself"); 
                String decision2 = sc.next();
                a = 0;
                while (a == 0){
                    if (decision2.equalsIgnoreCase("A")){ //Eat with Friends
                        a++;
                        System.out.println("\fYou wait until your friends show up to start eating.");
                    }
                    else if (decision2.equalsIgnoreCase("B")){ //Eat Alone
                        a++;
                        System.out.println("\fYou are super hungry so you sit at a table and start eating by yourself.");
                        System.out.print("Weirdly enough there aren't a lot of people in the dining hall. \nA couple sitting");
                        System.out.println(" at the table to your right seem to be bickering. There is a man wearing a black Pink Floyd");
                        System.out.print("T-shirt sitting by himself ");
                        System.out.print("at the table to your left and in front of you is a table full of guys from the");
                        System.out.println(" hockey team.");
                    }
                    else{
                        System.out.println("Please enter a valid choice");
                        decision2 = sc.next();
                    }
                }
            }
            if (decision1.equalsIgnoreCase("A") || decision1.equals("B")){
                System.out.print("After eating, your friends ask you if you would like to hangout,");
                System.out.print(" but you also have an important Computer Science \ntest Monday that you need to study for.");
                System.out.println(" You: \n(A) Hangout with your friends \n(B) Study for your test");
                String decision3 = sc.next();
                a = 0;
                while(a == 0){
                    if (decision3.equalsIgnoreCase("A")){ //Hangout with Friends
                        System.out.print("\fYou decide to hangout with your friends. They all vote on what to do and your vote");
                        System.out.print(" determines what you end up doing. You: \n(A) Want to go to the mall \n");
                        System.out.println("(B) Hangout in one of your friends' rooms");
                        String decision4c = sc.next();
                        a = 0;
                        while (a == 0){
                            if (decision4c.equalsIgnoreCase("A")){ //Mall
                                a++;
                                System.out.println("\fWhile at the mall, you buy some new shoes to wear to the formal tonight.");
                                System.out.println("You and your friends also go and watch a movie.");
                                status = "AL";
                            }
                            else if (decision4c.equalsIgnoreCase("B")){ //Friend's Room
                                a++;
                                System.out.print("\fYou all hangout in your friend's room. ");
                                System.out.println(f1 + "'s mom is overprotective and gave " + f1 + " a new taser so they give you their old taser.");
                                taser = true;
                                status = "AT";
                            }
                            else{
                                System.out.println("Please enter a valid choice");
                            }
                        }
                        a++;
                    }
                    else if (decision3.equalsIgnoreCase("B")){ //You Study
                        System.out.print("\fYou decide to go study so that you can ace that Compsci test. Where should");
                        System.out.println(" you go to study? You: \n(A) Go to the library \n(B) Go to your room");
                        String decision4b = sc.next();
                        a = 0;
                        while(a == 0){
                            if (decision4b.equalsIgnoreCase("A")){ //Library
                                a++;
                                System.out.print("\fYou go to the library to study, but you can only go for a couple");
                                System.out.println(" hours because you have to get ready for the formal tonight.");
                                status = "AT";
                            }
                            else if(decision4b.equalsIgnoreCase("B")){ //Study in Room
                                a++;
                                System.out.print("\fYou study in your room for a couple hours and then get ready for \n");
                                System.out.println("the formal you are going to tonight.");
                                status = "AT";
                            }
                            else{
                                System.out.println("Please enter a valid choice");
                            }
                        }
                        a++;
                    }
                    else{
                        System.out.println("Please enter a valid choice");
                    }
                }
            }
            else if (decision1.equalsIgnoreCase("C")){ //Go Off Campus & Die
                a++;
                System.out.print("\fYou decide to go off campus to eat at a restaurant. On the way you notice that there");
                System.out.print(" is a street festival. You carefully drive down \nthe street making sure to look for ");
                System.out.println("pedestrians. After you get through the busy festival, you reach a red traffic light.");
                System.out.print("Once the light turns green you continue straight head. You hear a car honking and");
                System.out.println(" turn your \nhead to the right just in time to see a speeding car collide with yours.");
                System.out.println("You see a flash of light and then...\n");
                status = "D";
            }
            else{ 
                System.out.println("Please enter a valid choice");
            }

        }
        return status;

    }

    private static String choiceC(){
        boolean loop=false;
        Random in=new Random();
        Scanner sc = new Scanner(System.in);
        String input = "";

        while(!loop){
            System.out.println("\fYou choose to go to the gym and workout. It was just a normal day at the gym.\n You were going to go take a shower after you were done ,");
            System.out.print("but since you skipped eating you're considering getting food");
            System.out.println("which option do you choose \n  (A) to get food : \n  (B) to take a shower:" );
            System.out.println("");
            input = sc.next();
            System.out.println();

            if(input.equalsIgnoreCase("a")){
                System.out.println("\fYou decided to get food instead of showering. While you're driving to get food you realize");
                System.out.print("that not taking a shower was a mistake and that your car brakes were not working normally \nyou get food and after consuming it take a shower \n after taking a shower and eating"); 

                loop =true; 
            }
            else if(input.equalsIgnoreCase("B")){
                System.out.println("\fYou decide to take a shower instead of getting food,and after you take a shower");
                System.out.println("you realize how hungry you are,\n and get food immediately  after");
                System.out.print("after eating and taking a shower ");
                loop =true;

            }
            else{

                System.out.println("Please input a proper inputs");

            }

        } 

        while(loop){
            int round=10+in.nextInt(20);
            System.out.println("\fYou want to relax,so you have the choice of playing Call of duty.\nYou can choose to play alone alone or with friends,"); 
            System.out.println("which do you choose?");
            System.out.println ("(A) if you choose to play Call of Duty with your friends\n (B) if you choose to play Call of Duty alone");
            System.out.print("");
            String input3 = sc.next();
            if(input.equals("a")||input.equals("A")){
                if(input3.equals("a")||input3.equals("A")){

                    System.out.println();
                    System.out.println("\fYou played Call of duty with your friends and had a good time. you reached round  "+round+" on WW2 zombies");
                    System.out.println("after playing Call of Duty with you decided to Study for your exam the coming friday ");
                    loop=false;
                }

                else if(input3.equals("b")||input3.equals("B")){
                    round=1+in.nextInt(5);
                    System.out.println();
                    System.out.println("\fYou played alone and reached round  "+round+" on WW2 zombies");
                    System.out.println("after playing Call of Duty you decide to study for your exam the coming Friday.");
                    loop=false;
                }
                else{

                    System.out.println("Please input a proper input");

                }
            }
            else if(input.equals("B")||input.equals("b")){
                if(input3.equals("a")||input3.equals("A")){

                    System.out.println();
                    System.out.println("\fYou played Call of Duty with your friends and had a good time. you reached round  "+round+" on WW2 zombies");
                    System.out.println("after playing Call of Duty with  you  decided to Study for your exam the coming friday ");
                    loop=false;
                }

                else if(input3.equals("b")||input3.equals("B")){
                    round=1+in.nextInt(5);
                    System.out.println();
                    System.out.println("\fYou played alone and reached round  "+round+" on WW2 zombies");
                    System.out.println("after playing Call of Duty you decide to study for your exam the coming friday");
                    loop=false;
                }
                else{

                    System.out.println("Please input a proper input");

                }
            }

        }

        while(!loop){
            System.out.println("\fYou have three choices for studying");
            System.out.println("(A) if you want to study  with friends\n(B) if you want to study alone ");
            System.out.println("(C),if you want drive to the library ");
            int gen=1+in.nextInt(3);
            String input2=sc.next();

            if(input2.equals("a")||input.equals("A")){
                System.out.print("\fYou studied in your friend's room. ");
                System.out.println(f1 + "'s mom is overprotective and gave " + f1 + " a new taser so they give you their old taser.");
                taser = true;
                loop=true;
                return "ae";
            }
            else if(input2.equals("b")||input.equals("B")){
                System.out.println("\fYou Studied and got some work done");
                loop=true;
                return "ae";
            }
            else if(input2.equals("c")||input.equals("C")){
                if(gen==1){
                    System.out.println("\fWhile heading to the library \n your car brakes down on train tracks and your door fails to open  ");
                    System.out.println("you are hit by a train a die a fiery death");
                    loop=true;
                    return "d";

                } 
                else if(gen==2){

                    System.out.println("\fYou went to the library and got home safe");
                    loop=true;
                    return "ae";
                }
                else if(gen==3){

                    System.out.println("\fYour car's brakes fail on your way to the library and you fall of a cliff to a fiery death.");
                    loop=true;

                    return "d";
                } 
            }

            else{
                System.out.println("input viable inputs");           
            }

        }
        return "";

    }

    private static String choiceD(){

        System.out.println("\fYou chose to do homework. Before you do homework, you go to the bathroom to brush your teeth and notice a RA program that says");
        System.out.println(" \"DON'T OVER STUDY!!!\". You go back to your room and ");
        System.out.println("open up your planner and see that you have to finish both english and math homework");
        System.out.println("Would you like to do math or english");
        System.out.println("(A) to do math \n(B) to do english)");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        while(!(choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b"))){
            System.out.println("Invalid Selection, enter valid input");
            choice = sc.next();
        }
        if (choice.equalsIgnoreCase("a")){
            System.out.println("\fYou choose to do math homework.  ");
            System.out.println("You have been working on math for a solid hour");
            System.out.println("Would you like to continue working or go grab food?");
            System.out.println("(A) to continue working \n(B) to grab food");
            choice = sc.next();
            while(!(choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b"))){
                System.out.println("Invalid Selection, enter valid input");
                choice = sc.next();
            }
            if (choice.equalsIgnoreCase("a")){
                System.out.println("\fYou choose to continue working");
                System.out.println("You have died of boredom");
                return "d";
            }

            else if(choice.equalsIgnoreCase("b")){
                System.out.println("\fYou choose to get food");
                System.out.println("You head over to the cafeteria and see that they have two choices today:");
                System.out.println("Would you like to eat the healthy grilled chicken salad or the delicious fried chicken?");
                System.out.println("(A) for the salad \n(B) for the fried chicken");
                choice = sc.next();
                while(!(choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b"))){
                    System.out.println("Invalid Selection, enter valid input");
                    choice = sc.next();
                }
                if (choice.equalsIgnoreCase("a")){
                    System.out.println("\fYou grab your salad and head back to your room. You feel good that you ate healthy, but you still feel hungry");
                    System.out.println("You have one hour left until the dance starts");
                    System.out.println("Would you like to grab a snack and go hang out with your friend Steve, or take a nap?");
                    System.out.println("(A) to grab a snack and head to your friend's room \n(B) to take a nap");
                    choice = sc.next();
                    while(!(choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b"))){
                        System.out.println("Invalid Selection, enter valid input");
                        choice = sc.next();
                    }
                    if (choice.equalsIgnoreCase("a")){
                        System.out.println("\fAfter hanging out with your friend, you get ready for the dance.  You arrive at the dance on time");
                        return "at";
                    }
                    else if (choice.equalsIgnoreCase("b")){
                        System.out.println("\fYou took a nap and feel well rested, but you look at the alarm clock and realized that you overslept!");
                        System.out.println("You get ready as fast as you can and arrive at the dance late.");
                        return "al";

                    }}
                else if (choice.equalsIgnoreCase("b")){
                    System.out.println("\fYou head back to your room after eating the fried chicken meal. Your dance is in one hour");
                    System.out.println("The chicken tasted very good at the time, but now you begin to have regrets");
                    System.out.println("You begin to feel groggy and sit down on your bed. You feel your eyes close and embrace the warm feeling of slumber.");
                    System.out.println("You wake up and feel well rested, but you look at the alarm clock and realized that you overslept!");
                    System.out.println("You get ready as fast as you can and arrive at the dance late.");
                    return "al";

                }
            }}
        else if (choice.equalsIgnoreCase("b")){
            System.out.println("\fYou have been working on english homework for an hour. You can no longer take it.");
            System.out.println("Would you like to go get something to eat, or would you like to go to get an outfit to the dance?");
            System.out.println("(A) To get something to eat\n(B) To go get an outfit");
            choice = sc.next();
            while(!(choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b"))){
                System.out.println("Invalid Selection, enter valid input");
                choice = sc.next();
            }
            if (choice.equalsIgnoreCase("a")){
                System.out.println("\fYou choose to get food");
                System.out.println("You head over to the cafeteria and see that they have two choices today:");
                System.out.println("Would you like to eat the healthy grilled chicken salad or the delicious fried chicken?");
                System.out.println("(A) for the salad \n(B) for the fried chicken");
                choice = sc.next();
                while(!(choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b"))){
                    System.out.println("Invalid Selection, enter valid input");
                    choice = sc.next();
                }
                if (choice.equalsIgnoreCase("a")){
                    System.out.println("\fYou grab your salad and head back to your room. You feel good that you ate healthy, but you still feel hungry");
                    System.out.println("You have one hour left until the dance starts");
                    System.out.println("Would you like to grab a snack and go hang out with your friend X, or take a nap?");
                    System.out.println("(A) to grab a snack and head to your friend's room \n(B) to take a nap");
                    choice = sc.next();
                    while(!(choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b"))){
                        System.out.println("Invalid Selection, enter valid input");
                        choice = sc.next();
                    }
                    if (choice.equalsIgnoreCase("a")){
                        System.out.println("\fAfter hanging out with your friend, you get ready for the dance.  You arrive at the dance on time");
                        return "at";
                    }
                    else if (choice.equalsIgnoreCase("b")){
                        System.out.println("\fYou took a nap and feel well rested, but you look at the alarm clock and realized that you overslept!");
                        System.out.println("You get ready as fast as you can and arrive at the dance late.");
                        return "al";

                    }}
                else if (choice.equalsIgnoreCase("b")){
                    System.out.println("\fYou head back to your room after eating the fried chicken meal. Your dance is in one hour");
                    System.out.println("The chicken tasted very good at the time, but now you begin to have regrets");
                    System.out.println("You begin to feel groggy and sit down on your bed. You feel your eyes close and embrace the warm feeling of slumber.");
                    System.out.println("You wake up and feel well rested, but you look at the alarm clock and realized that you overslept!");
                    System.out.println("You get ready as fast as you can and arrive at the dance late.");
                    return "al";

                }}
            else if (choice.equalsIgnoreCase("b")){
                System.out.println("\fYou go out and begin shopping for an outfit. You can buy a cheap outfit and save money,");
                System.out.println("or buy a more expensive one and look good");
                System.out.println("(A) for the cheap outfit \n(B) for the expensive one");
                choice = sc.next();
                while(!(choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b"))){
                    System.out.println("Invalid Selection, enter valid input");
                    choice = sc.next();
                }
                if (choice.equalsIgnoreCase("a")){
                    System.out.println("\ffYou bought cheap clothes. You don't like the way you look, but you are happy with the money that you have.");
                    System.out.println("You return back to your room and are feeling tired. You glance at the clock and see that");
                    System.out.println("the dance is in two hours. You decide to take a quick nap. You wake up and arrive to the");
                    System.out.println("dance on time.");
                    return "at";
                }
                if (choice.equalsIgnoreCase("b")){
                    System.out.println("\fYou decide to spend all of your money on a very pricey outfit. When you go back to your room");
                    System.out.println("you notice there is a bulge in one of your pockets. You slip your hand inside and pull out a ");
                    System.out.println("taser. You are shocked and do not know what to do with it, but after a long pause, you decide ");
                    System.out.println("place it in your pocket and hope that you never need to use it");
                    taser = true;
                    System.out.println("You are feeling tired. You glance at the clock and see that the dance is ");
                    System.out.println("in two hours. You decide to take a quick nap. You wake up and arrive to the");
                    System.out.println("dance on time.");
                    return "at";
                }
            }

        }
        return "  ";

    }

    public static void main(String args[]){
        int num = 0;
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("|       Welcome to A Dance with Death         |");
        System.out.println("| The Game Has Started. Your Goal: Stay Alive |");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("You are a college student and the weekend just started. You have been looking forward to the formal tonight.");
        while (num < 2)
        {
            status = "D";
            String result = "F";
            Scanner sc = new Scanner(System.in);
            while(!result.equalsIgnoreCase("A") && !result.equalsIgnoreCase("B") && !result.equalsIgnoreCase("C") && !result.equalsIgnoreCase("D")){
                System.out.println("Good morning! You look at the clock and realize that you woke up late!");
                System.out.println("Do you: \n(A) Go back to bed \n(B) Eat food \n(C) Go to the gym \n(D) Work on homework?");
                String result1 = sc.next();
                result = "A";
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
                    status = choiceD();
                }
                else{
                    result = result1;
                    System.out.println("Please enter a valid option");
                }
            }
            //End part I, beginning part II (Formal)

            if (status.substring(0,1).equalsIgnoreCase("A"))
            {
                if(status.substring(1,2).equalsIgnoreCase("E"))
                {
                    System.out.println("You get to the Formal early.\nYou walk around for a little while and you overhear an officer talkng about the crime rate\nand how it has been increasing in the area");
                    //killer situation
                }
                else if (status.substring(1,2).equalsIgnoreCase("T"))
                {
                    System.out.println("You arrive at the Formal at the on time.");
                    System.out.println("Your friends are calling you over to dance with them.\n(A) Go and dance with your friends\n(B) Sit down at a table");
                    String choice = sc.next();
                    boolean valid = false;
                    while(!valid)
                    {

                        if (choice.equalsIgnoreCase("A"))
                        {
                            System.out.println("\fAfter dancing around with your friends for a while, you decide to walk outside and get some fresh air.");
                            valid = true;
                        }
                        else if (choice.equalsIgnoreCase("B"))
                        {
                            System.out.println("\fYou get bored sitting around and decide to walk outsdie for some fresh air.");
                            valid = true;
                        }
                        else
                        {
                            System.out.println("\fEnter a valid option");
                            choice = sc.next();
                        }

                    }
                }
                else
                {
                    System.out.println("You showed up late to the Formal and it is too cluttered. ");
                    System.out.println("You decide to go out for some air");
                }
            }
            boolean valid = false;

            if (status.substring(0,1).equalsIgnoreCase("A"))
            {
                System.out.println("While you are outside, you see " + f1 + ", " + f2 + " and " + s1 + "\nDo you decide to go with them?\n(A) Yes\n(B) No");
                while (!valid)
                {
                    String choice1 = sc.next();
                    if (choice1.equalsIgnoreCase("A"))
                    {
                        System.out.println("\fAfter a while it starts to get close to the curfew time.\n" + f1 + " is about to leave, do you leave with " + f1 + " ?\n(A) Leave with them\n(B) Stay with " + f2 + " and " + s1);
                        boolean valid2 = false;
                        while(!valid2)
                        {
                            String choice2 = sc.next();
                            if (choice2.equalsIgnoreCase("A"))
                            {
                                System.out.println("\fYou walk with " + f1 + " to his house. When you get " + f1 + "'s house, " + f1 + " tells you his parents will be able to give you a ride to your house.\nDo you take the ride offered?\n(A) Take the ride\n(B) Walk home");
                                boolean valid3 = false;
                                while (!valid3)
                                {
                                    String choice3 = sc.next();
                                    if (choice3.equalsIgnoreCase("A"))
                                    {
                                        System.out.println("\fOn the ride back to your house, you look out of the window and you notice a person in a blue sweater with blood. You make it home, and you go to bed.");
                                        num++;
                                        alive = true;
                                        valid3 = true;
                                    }
                                    else if (choice3.equalsIgnoreCase("B"))
                                    {
                                        System.out.println("\fYou walk home and on your way there, you feel as though you are being\nwatched. You look back and you see a person in blue sweater running towards you.\nYou walk faster, and before you have a chance to look back, the person kills you");
                                        alive = false;
                                        valid3 = true;
                                    }
                                    else 
                                    {
                                        System.out.println("Enter a valid option");
                                    }
                                }
                                valid2 = true;
                            }
                            else if (choice2.equalsIgnoreCase("B"))
                            {
                                System.out.println("You stay and hang out for an hour longer. At this point, you all decide it is\ntime to go home and you all take the shortcut through an ally");
                                System.out.println("While walking back, you hear something that gets your attention, and you look \nthat direction. You get pushed from the side and you bang your head on \nthe wall, you do not get a chance to see who pushed you, and \n you hear a yell.");
                                if (taser)
                                {
                                    System.out.println("You remember that you have a taser and use it against the attacker.\nYou run as fast as you can and you escape");
                                    alive = true;
                                    num++;
                                }
                                else
                                {
                                    System.out.println("Before you get a chance to look at the attacker, you get stabbed");
                                    alive = false;
                                }
                                valid2 = true;
                            }
                            else 
                            {   
                                System.out.println("\fEnter a valid option");
                            }
                        }
                        valid = true;
                    }
                    else if (choice1.equalsIgnoreCase("B"))
                    {
                        System.out.println("\fYou walk along and run into " + f3 + " " + s2 + " " + s3 + " and you decide to hang out with them for a little while");
                        System.out.println("As the time gets closer to the curfew, everyone decides to go to " + s2 + "'s house. \nConsidering the only person you know in the group well is " + f3 + " you decide to go back home.");
                        System.out.println("While you are walking home, there is a shortcut to take that will save you 10 minutes.\nYou decide to take it because you are already past curfew.");
                        System.out.println("When taking the shortcut, you walk through an ally that is dimly lit.\nYou get paranoid so you decide to walk a bit faster. You turn the corner and you see " + f2 + " on the floor and unresponsive.");
                        System.out.println("When you move in closer, a person in a hoodie walks out from the shadows.\nYou try to get his name, but he keeps rushing towards you. You try to run, but he catches you.");
                        valid = true;
                        alive = false;
                    }
                    else
                    {
                        System.out.println("\fEnter a valid option");
                    }
                }
            }
            else 
            {
                alive = false;
            }

            num++;
            if (alive)
            {
                System.out.println("YOU WIN");
            }
            if (num < 2)
            {
                System.out.println("\nDo you want to try again? (You get two tries) \n(Y)\n(N)");
                String choice1 = sc.next();
                if (choice1.equalsIgnoreCase("Y"))
                {
                    System.out.print ('\f');
                }
                else
                {  
                    System.out.print ('\f');
                    num++;
                }
            }
            alive = true;
        }
    }
}
