import java.util.Scanner;
public class Swap_2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no. ");
        int i = sc.nextInt();
        System.out.println("Enter the second number. ");
        int j = sc.nextInt();
        System.out.println("Numbers before swapping are "+i+" and "+j);
        i = i + j;
        j = i - j;
        i = i - j;
        System.out.println("Numbers after swapping are "+i+" and " + j);
    }
}  