import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class NumberGame {
    public static void main(String [] args){
        int randomNum =(int) (Math.random()*100) + 1;
        boolean hasWon = false;
        System.out.println("I have a chosen a number between 1 and 100.. try to guess it");
        System.out.println("You can make 10 guesses");
        Scanner in = new Scanner(System.in);
        for(int i=10;i>0;i--){
            System.out.println("You have " + i + " guesses left");
            int guess = in.nextInt();

            if(randomNum<guess){
                System.out.println("The number is lesser than your guess");
            }
            else if(randomNum>guess){
                System.out.println("The number is greater than your guess");
            }
            else{
                hasWon = true;
                break;
            }
        }
        if(hasWon){
            System.out.println("Yes ur guess is correct!You won..congrats!!");
        }
        else{
            System.out.println("Sry u lose..The number is "+randomNum);
        }
    }
}
