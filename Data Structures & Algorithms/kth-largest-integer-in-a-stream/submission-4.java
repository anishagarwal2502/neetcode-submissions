class KthLargest {

    private PriorityQueue<Integer> heap;
    private int k;

    public KthLargest(int k, int[] nums) {
        heap = new PriorityQueue(k+1);
        this.k = k;
        for(int i = 0; i<nums.length ; i++){
            heap.add(nums[i]);
            if(heap.size()>k){
                heap.poll();
            }
        }
    }
    
    public int add(int val) {
        heap.add(val);
        if(heap.size()>this.k){
            heap.poll();
        }

        return heap.peek();
    }
}
