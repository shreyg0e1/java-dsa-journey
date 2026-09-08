import java.util.Scanner ;

class TablePrint{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number you want to print table off:- ");

        int N = scn.nextInt();

        // while loop 

        // int t = 1;
        // while(t <= 10){
        //     int mul = N * t;
        //     System.out.println(N + " * " + t + " = " + " " + mul);
        //     t++;
        // }


        // loop 

        for(int t = 1; t <=10; t++ ){
            int mul = N * t;
            System.out.println(N + " * " + t + " = " + mul);
        }
    }
}