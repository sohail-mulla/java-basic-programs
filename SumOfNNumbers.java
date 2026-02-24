import java.util.Scanner;
public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a value : ");
        int n = input.nextInt();
        int sum = sumofnos(n);
        System.out.println("The sum of nos. is   : "+ sum);
    }
        public static int sumofnos(int m){
            return m*(m+1)/2;
        }
}
