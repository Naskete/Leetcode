package Number;

// 1523 Count Odd Numbers in an Interval Range
public class CountOdds {
    public int countOdds(int low, int high) {
        if (low % 2 == 0 && high % 2 == 0) {
            return (high - low) / 2;
        } else {
            return (high - low) / 2 + 1;
        }
        // if (low % 2 != 0 && high % 2 != 0) { // 都为奇数
        //     return (high - low) / 2 + 1;
        // } else if (low % 2 == 0 && high % 2 == 0) {
        //     return (high - low) / 2;
        // } else if (low % 2 != 0 && high % 2 == 0) {
        //     return (high - low) / 2 + 1;
        // } else {
        //     return (high - low) / 2 + 1;
        // }
    }
}

// 闭区间内，两端为偶数时，其中奇数个数为 （high - low） / 2， 其他情况均为 （high - low）/ 2 + 1;
