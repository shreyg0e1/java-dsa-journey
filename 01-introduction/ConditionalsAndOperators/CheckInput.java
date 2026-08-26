package ConditionalsAndOperators;
import java.util.Scanner ;

class CheckInput {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int input = scn.nextInt();

        if(input > 0 ){
            System.out.println("Input is Positive");
        }else if(input < 0){
            System.out.println("Input is Negative");
        }
        else{
             System.out.println("Input is 0, So Neither Positive nor Negative");
        }
    }
}
