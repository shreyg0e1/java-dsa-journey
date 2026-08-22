import java.util.Scanner ;
class Input{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x;
        x= scn.nextInt();
        int y = scn.nextInt();
        double db= scn.nextDouble();

        System.out.println("The value of x : " + x);
        System.out.println("The value of y : " + y);
        System.out.println("The valuse of db :" + db);
    }
}