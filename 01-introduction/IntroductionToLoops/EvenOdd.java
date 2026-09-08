//  ques:- Make user enter and decide how many numbers he/she wanted to check (even / odd), then tell them accordingingly.

import java.util.Scanner ;
class EvenOdd{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("How much number user wanted to check for even or odd :- ");
        int testcase = scn.nextInt();
       
        while(testcase > 0){
            System.out.print("Enter the no. you want to check:- ");
            int num = scn.nextInt();
            if(num % 2 == 0){
                System.out.println("This is a EVEN number");
            } else{
                System.out.println("This is a ODD number");
            }
            testcase--;
        }
    }
}





// ques:- Take only 5 input, from user and check even or odd number:-
// this way is specific according to question but more professional is above.

// import java.util.Scanner ;
// class EvenOdd{
//     public static void main(String[] args){
//         Scanner scn = new Scanner(System.in);

//         int input = 1;
//         while(input < 6){
//             int num = scn.nextInt();
//             if(num % 2 == 0){
//                 System.out.println("This is a EVEN number");
//             } else{
//                 System.out.println("This is a ODD number");
//             }
//             input++;
//         }
//     }
// }