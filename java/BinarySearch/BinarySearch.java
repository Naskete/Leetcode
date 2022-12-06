package BinarySearch;
public class BinarySearch {
    public static int search(int[] list, int target){
        int start = 0, end = list.length;
        while(start!=end) {
            int mid = (start + end) / 2;
            if (list[mid] > target) {
                end = mid;
            } else if (list[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
