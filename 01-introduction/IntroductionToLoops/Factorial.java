import java.util.Scanner;

class Factorial{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number for factorial :- ");
        long num = scn.nextInt();
        long res = 1;


        // WHILE loop

        // ----------------MY THOUGHT--------------------------

        if (num == 0) {
            System.out.print("The Factorial of 0 = 1 ");
        }

        else{
        while(num > 0){
                res = res * num;
                if(num == 1){
                    System.out.print(num + " = ");
                }else {
                    System.out.print(num + " * ");
                }
                num--;
            }
            System.out.println(res);
        }
    }
}

// ---------------------------------------while loop different approch (0 is handle by its own)-------------------------------------

 //     long mul=1;
        
    //     while(mul <= num){
    //             res = res * mul;
    //             if(mul == num){
    //                 System.out.print(num + " = ");
    //             }else {
    //                 System.out.print(mul + " * ");
    //             }
    //             mul++;
            
    //     }
    //     System.out.println(res);
    // }

    // -------------------------------------------------------------------------------------

    // FOR loop

    // for(long mul= 1 ; mul <= num; mul++){
    //     res = res * mul;
        
    // }
    //     System.out.println("the factorial of " + num + " : " + res);

    // }
