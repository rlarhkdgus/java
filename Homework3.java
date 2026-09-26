import java.util.Scanner;

public class Homework3 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int count = sc.nextInt();
        int[] nums = new int[count];

        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            nums[i] = sc.nextInt();
        }

        int max = nums[0], min = nums[0];
        for (int i = 0; i < count; i++) {
            if(nums[i] > max) max = nums[i];
            if(nums[i] < min) min = nums[i];
        }

        System.out.printf("최대값 : %d\n",max);
        System.out.printf("최소값 : %d\n",min);
    }
}
