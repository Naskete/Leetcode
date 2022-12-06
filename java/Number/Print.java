package Number;

// https://leetcode.cn/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
public class Print {
    public int[] printNumbers(int n) {
        int max = (int) Math.pow(10, n) - 1;
        int[] arr = new int[max];
        for (int i = 0; i < max; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
