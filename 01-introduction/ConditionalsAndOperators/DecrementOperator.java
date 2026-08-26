package ConditionalsAndOperators;
class DecrementOperator{
    public static void main(String[] args){
        int y = 7;

        // Post Decrement y--

        if(y-- == 7){ // first evaluation then decrement
            System.out.println("The value of y is : " + y);
        } else {
            System.out.println("We are in else");
        }

        int x = 7;

        // Pore Decrement --x

        if(--x == 7){ // first decrement, then evaluation
            System.out.println("The value of x is : " + x);
        } else {
            System.out.println("We are in else");
        }
        System.out.println("The value of x is : " + x);
    }
}