public class PrimeNumberCheck {

    public static void main(String[] args) {

//        System.out.println(isPrime(24));
        System.out.println(isPrime2(19));
    }

    static boolean isPrime(int num) {                //  <-------------Best optimal way
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }




    static boolean isPrime2(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

}
