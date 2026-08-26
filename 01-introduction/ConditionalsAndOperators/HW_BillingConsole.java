package ConditionalsAndOperators;
import java.util.Scanner ;
class HW_BillingConsole{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Billing Console");
        System.out.println("***************");

        System.out.print ("Enter the cost of First Object : ");
        int first = scn.nextInt();

        System.out.print ("Enter the cost of Second Object : ");
        int second = scn.nextInt();

        System.out.print ("Enter the cost of Third Object : ");
        int third = scn.nextInt();

        System.out.println("***************");

        System.out.println("BILL :- ");

        System.out.println("Cost of 1st Object :- " + first + " rs");
        System.out.println("Cost of 2nd Object :- " + second + " rs");
        System.out.println("Cost of 3rd Object :- " + third + " rs");

        int total = first + second + third ;

        System.out.println("********************");

        System.out.println("Total Cost :- " + total + " rs");

        System.out.println("********************");

        double gst = total * 0.18 ;

        System.out.println("GST (18% applied)  :- " + gst + " rs");

        double bill = total + gst ;

        System.out.println("********************");

        System.out.println("Total Bill to be Paid :- " + bill + " rs");

        System.out.println("********************");

    }
}