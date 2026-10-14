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
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        Interval last = null;
        for (Interval i : intervals) {
            if (null == last)
                last = i;
            else {
                if (i.start < last.end)
                    return false;
                last = i;
            }
        }

        return true;
    }
}
