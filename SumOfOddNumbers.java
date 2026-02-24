import java.util.Scanner;
public class SumOfOddNumbers
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number : ");
        int value = input.nextInt();
        int count  =  (1 + value)/2;
        int sum = count*count;

        System.out.println("The sum of all odd numbers from 1 to "+ value +" is " + sum );

    }
}
