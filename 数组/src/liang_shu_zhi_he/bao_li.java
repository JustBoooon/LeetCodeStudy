package liang_shu_zhi_he;

import java.util.Arrays;

public class bao_li {
    int[] array = new int[]{1, 2, 3, 6, 9};
    int target = 7;

    public int[] sum (int[] arr, int tar) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] + arr[j] == tar) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }


    public static void main(String[] args) {
        bao_li b1 = new bao_li();
        int[] s = b1.sum(b1.array, b1.target);
        System.out.println("符合两数和为目标值的数组下标数组为：" + Arrays.toString(s));
    }
}
