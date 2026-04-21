class KthLargest {

    private PriorityQueue<Integer> heap;
    private int k;

    public KthLargest(int k, int[] nums) {
        heap = new PriorityQueue(k);
        this.k = k;
        for(int i = 0; i<Math.min(k,nums.length) ; i++){
            heap.add(nums[i]);
        }
        for(int i = k; i< nums.length ; i++){
           if(heap.peek()<nums[i]){
                heap.poll();
                heap.add(nums[i]);
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
