class MedianFinder {
    PriorityQueue<Integer> min, max;

    public MedianFinder() {
        min = new PriorityQueue<>();
        max = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
    }

    public void addNum(int num) {
        if (max.isEmpty() || num < max.peek())
            max.add(num);
        else
            min.add(num);

        if (Math.abs(max.size() - min.size()) < 2)
            return;

        if (max.size() > min.size())
            min.add(max.remove());
        else
            max.add(min.remove());
    }

    public double findMedian() {
        if (min.size() == max.size())
            return ((double) max.peek() + min.peek()) / 2;
        else {
            if (max.size() > min.size())
                return max.peek();
            else
                return min.peek();
        }
    }
}
