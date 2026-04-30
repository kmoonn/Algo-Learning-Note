import java.util.Arrays;

public class ArraysApi {
    public static void main(String[] args) {
        // 创建数组
        int[] arr1 = new int[10];
        int[] arr2 = new int[]{1, 2, 3};
        // 排序
        Arrays.sort(arr1);
        // 自定义排序
        int[][] people = new int[10][10];
        Arrays.sort(people, (a, b) -> {
            if (a[0] != b[0]) {
                return b[0] - a[0];
            } else {
                return a[1] - b[1];
            }
        });


    }
}
