import java.util.*;
import java.math.*;


public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int random= (int) (Math.random()*100);
        System.out.println(random);
        System.out.println("Guess a number between 1 & 100");
        System.out.println("==============================");
        boolean cont=true;
        do{
            System.out.print("Enter the number:- ");
            int no= sc.nextInt();
            int diff=Math.abs(random-no);
//            System.out.println(diff);
            if(no==random){
                System.out.println("YAY....!! Correct Guess...!");
                cont=false;
                break;
            }
            else if(diff<=5){
                System.out.println("Too close....");
                System.out.println("Want to continue...! (Y/N)");
                String s=sc.next().toUpperCase();
                if(s.equals("N")){
                    cont=false;
                }
            }
            else if(random-no<=20 && random-no>0){
                System.out.println("Quite low guess....");
                System.out.println("Want to continue...! (Y/N)");
                String s=sc.next().toUpperCase();
                if(s.equals("N")){
                    cont=false;
                }
            }
            else if(no-random<=20 && no-random>0){
                System.out.println("Quite high guess....");
                System.out.println("Want to continue...! (Y/N)");
                String s=sc.next().toUpperCase();
                if(s.equals("N")){
                    cont=false;
                }
            }
            else if(no-random<=50 && no-random>0){
                System.out.println("Too High guess....");
                System.out.println("Want to continue...! (Y/N)");
                String s=sc.next().toUpperCase();
                if(s.equals("N")){
                    cont=false;
                }
            }
            else if(random-no<=50 && random-no>0){
                System.out.println("Too Low guess....");
                System.out.println("Want to continue...! (Y/N)");
                String s=sc.next().toUpperCase();
                if(s.equals("N")){
                    cont=false;
                }
            }
            else{
                System.out.println("Difference b/w numbers is more than 50...!");
                System.out.println("Want to continue...! (Y/N)");
                String s=sc.next().toUpperCase();
                if(s.equals("N")){
                    cont=false;
                }
            }
        }
        while(cont);
    }
}
