class KthLargest {

    private PriorityQueue<Integer> heap;

    public KthLargest(int k, int[] nums) {
        heap = new PriorityQueue(k);
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
        if(heap.peek()<val){
            heap.poll();
            heap.add(val);
        }

        return heap.peek();
    }
}
