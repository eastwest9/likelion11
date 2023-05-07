import java.util.Scanner;

class find{
    void findEvenOdd(int n){
        int i = n;
        if(i%2 == 0){
            System.out.println(n + " is Even(짝수)");
        } else {
            System.out.println(n + " is Odd(홀수)");
        }
    }
}

public class pra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        find f = new find();

        System.out.print("Input : ");
        int n = sc.nextInt();
        f.findEvenOdd(n);

    }
}
