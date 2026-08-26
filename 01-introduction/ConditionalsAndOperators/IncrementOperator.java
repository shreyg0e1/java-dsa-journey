package ConditionalsAndOperators;
class IncrementOperator{
    public static void main(String[] args){
        int y = 7;
        int x = 7;
        // post increment y++, First evaluation then increment

        if(y++ == 7){ // First evaluation [y++ = 7 is true], then increment [y = 8], {yani vo phele y++ == 7 vali condition true krra hai}
            System.out.println("The value of y is :" + y);
        } else {
            System.out.println("We are in else");
        }

        // pre increment ++x, First increment then evaluation

        if(++x == 7){ // First increment [x = 8], then evaluation [++x == 7 is true or not], because [x = 8], so else will run
            System.out.println("The value of x is :" + x);
        } else {
            System.out.println("We are in else");
        }
        System.out.println("The value of x is :" + x);
    }
}
