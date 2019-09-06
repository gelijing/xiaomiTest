package bishi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 买东西 N元预算 买最少的东西
 * 若不匹配 返回-1
 */
public class BuyThings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int[] arr = new int[M];
        for (int i = 0; i < M; i++){
            arr[i] = sc.nextInt();
        }
        int N = sc.nextInt();
        System.out.println(solution(M,arr,N));
    }

    private static int solution(int m, int[] arr, int n) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = arr.length-1 ; i >= 0 ; i--){
            count += n/arr[i];
            n = n % arr[i];
            if (n == 0){
                break;
            }
        }
        if (n != 0){
            return -1;
        }
        return count;
    }
}
