package ConditionalsAndOperators;
import java.util.Scanner ;
class MarksheetBot {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int marks = scn.nextInt();

        if(marks > 90){
            System.out.println("Excellent");
        } else if(marks >=80 ){
            System.out.println("Very Good");
        } else if(marks >= 60 ){
            System.out.println("Good");
        } else if(marks >= 45 ){
            System.out.println("Average");
        } else if(marks >= 33 ){
            System.out.println("Can do better");
        } else {
            System.out.println("Work Hard");
        }
    }
}



// -----------------------------------My Code mistake--------------------------------
// import java.util.Scanner ;
// class MarksheetBot {
//     public static void main(String[] args){
//         Scanner scn = new Scanner(System.in);

//         int marks = scn.nextInt();

//         if(marks >=90){
//             System.out.println("Excellent");
//         } else if(marks >=80 && marks < 90){
//             System.out.println("Very Good");
//         } else if(marks >= 60 && marks < 80){
//             System.out.println("Good");
//         } else if(marks >= 45 && marks < 60){
//             System.out.println("Average");
//         } else if(marks >= 33 && marks < 45){
//             System.out.println("Can do better");
//         } else if(marks < 33){
//             System.out.println("Work Hard");
//         }
//     }
// }
