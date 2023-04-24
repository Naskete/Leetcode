package Array;

import java.util.*;

public class LastStone {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) return stones[0];
        PriorityQueue<Integer> queue = new PriorityQueue<>((x, y) -> y - x);
        for (int stone : stones) {
            queue.add(stone);
        }
        while (queue.size() > 1) {
            int y = queue.poll();
            int x = queue.poll();
            if (y == x) {
                continue;
            }
            queue.add(y - x);
        }
        if (queue.isEmpty()) return 0;
        return queue.poll();
    }
}
