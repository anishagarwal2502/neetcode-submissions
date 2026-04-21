class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> heap = new PriorityQueue(Collections.reverseOrder());

        for(int wt: stones){
            heap.offer(wt);
        }
        
        while(heap.size()>1){
            int max = heap.poll();
            int low = heap.poll();
            if(max!=low){
                heap.offer(max-low);
            }
        }

        return heap.isEmpty()?0:heap.poll();
        
    }
}
