import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        System.out.println("Input the constants :");
        System.out.println();
        System.out.println("a =");
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        System.out.println("a =" + a);
        System.out.println();
        System.out.println("b =");
        float b = scan.nextFloat();
        System.out.println("b = " +b);
        System.out.println();
        System.out.println("c =");

        float c = scan.nextFloat();
        System.out.println("c = " + c);
        System.out.println();
         double y;

        double root1,root2;
         y = b*b -4*a*c;
         if (y>0){
             root1 = (- b + Math.sqrt(y) )/2*a;
             root2= (-b - Math.sqrt(y))/2*a;
             System.out.println("The roots are " + root1 + "and " + root2);

         }
         else if (y == 0){
             root1 = - b /(2*a);
             System.out.println("The root are = " +root1);
         }
         else{
             System.out.println("The roots are unreal");
         }





    }
}
