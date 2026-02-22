import java.util.Scanner;

public class OddEvenTernary
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        OddEvenTernary object = new OddEvenTernary();
        int result = object.OddEven(num);

        if (num < 0){
            System.out.println("The entered number should be greater than 0 ! Try again.");
        }
        else {
            if (result == 0)
            {
                System.out.println("The entered number is EVEN");
            }
            else
            {
                System.out.println("The entered number is ODD");
            }
        }
    }

        public int OddEven(int number){
          // using ternary operator
            return (number% 2 == 0)? 0 : 1 ;
        }
}


