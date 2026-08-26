package ConditionalsAndOperators;
import java.util.Scanner ;
class LeapYear{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int year = scn.nextInt();

        if ((year % 4) == 0) {
            if ((year % 100) == 0) {
                if ((year % 400) == 0) {
                    System.out.println("Year is a Leap Year");
                } else {
                System.out.println("Year is NOT a Leap Year");
                }
            } else{
                System.out.println("Year is a Leap Year");
            }
        } else {
                System.out.println("Year is NOT a Leap Year");
                }
    }
}