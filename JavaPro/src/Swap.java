import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no. ");
        int i = sc.nextInt();
        System.out.println("Enter the second number. ");
        int j = sc.nextInt();
        System.out.println("Number before swapping are "+i+" and "+j);
        int t = i;
        i = j;
        j = t;
        System.out.println("Numbers after swapping are "+i+" and "+j);
    }
}
