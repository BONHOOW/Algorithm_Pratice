import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] arr = new int[A];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int C = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == C){
                sum++;
            }
        }System.out.print(sum);

    }
}