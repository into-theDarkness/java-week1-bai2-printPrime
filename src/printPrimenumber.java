import java.util.Scanner;

public class printPrimenumber {
    static int N = 2;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to can lay: ");
        int number = input.nextInt();
        int count = 0;
        for ( int i =2; count < number; i++){
            if(checkPrime(i) ==true){
                System.out.println(i);
                count++;
            }
        }
    }

    public static boolean checkPrime(int N) {
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}
