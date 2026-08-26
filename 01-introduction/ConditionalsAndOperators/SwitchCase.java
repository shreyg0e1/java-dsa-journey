package ConditionalsAndOperators;
import java.util.Scanner ;
class SwitchCase {
    public static void main(String[] args){
        Scanner scn =  new Scanner(System.in);

        int day = scn.nextInt();

       switch(day){
        case 1:
            System.out.println("Today is MONDAY");
            break;
        
        case 2:
            System.out.println("Today is TUESDAY");
            break;
        
        case 3:
            System.out.println("Today is WEDNESDAY");
            break;
        
        case 4:
            System.out.println("Today is THURSDAY");
            break;
        
        case 5:
            System.out.println("Today is FRIDAY");
            break;
        
        case 6:
            System.out.println("Today is SATURDAY");
            break;
        
        case 7:
            System.out.println("Today is SUNDAY");
            break;
        
        default :
            System.out.println("No such Day of Week");
            break;
        
       }
    }
}
