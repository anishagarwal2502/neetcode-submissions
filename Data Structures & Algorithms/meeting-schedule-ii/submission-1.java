/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        intervals.sort((a, b) -> a.start - b.start);
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        if (intervals.size() > 0)
            heap.add(intervals.get(0).end);

        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start >= heap.peek())
                heap.remove();
            heap.add(intervals.get(i).end);
        }

        return heap.size();
    }
}
