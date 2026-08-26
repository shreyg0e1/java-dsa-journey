package IntroductionToProgramming;
import java.util.Scanner ;
class Average{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        double avg = (a + b + c) / 3.0;

        System.out.println("The first number is :- " + a);
        System.out.println("The second number is :- " + b);
        System.out.println("The third number is :- " + c);

        System.out.println("The Average of 3 numbers is:- " + avg);
    }
}