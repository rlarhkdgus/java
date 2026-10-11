import java.util.Scanner;

public class Homework4 {

    int gcd1(int m, int n) {
        if(n == 0) return m;
        int max, min;
        if(m > n) {
            max = m;
            min = n;
        }
        else {
            max = n;
            min = m;
        }

        return gcd1(min,max%min);
    }
    int gcd2(int m, int n) {
        int a, b, temp; //a >= b
        if(m > n) {
            a = m;
            b = n;
        }
        else {
            a = n;
            b = m;
        }

        while(b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Homework4 main = new Homework4();
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수를 입력하세요 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("두 수의 최대공약수는 %d 입니다\n",main.gcd1(a,b));
        System.out.printf("두 수의 최대공약수는 %d 입니다\n",main.gcd2(a,b));
    }
}
