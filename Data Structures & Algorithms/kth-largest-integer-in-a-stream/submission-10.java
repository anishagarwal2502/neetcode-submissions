class KthLargest {

    private PriorityQueue<Integer> heap;
    private int k;

    public KthLargest(int k, int[] nums) {
        heap = new PriorityQueue(k+1);
        this.k = k;
        for(int n: nums){
            add(n);
        }
    }
    
    public int add(int val) {
        heap.offer(val);
        if(heap.size()>this.k){
            heap.poll();
        }

        return heap.peek();
    }
}
