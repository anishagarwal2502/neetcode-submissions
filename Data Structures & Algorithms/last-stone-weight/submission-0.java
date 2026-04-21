class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> heap = new PriorityQueue(Collections.reverseOrder());

        for(int wt: stones){
            heap.offer(wt);
        }

        int max = 0;
        int low = 0;
        
        while(heap.size()>1){
            max = heap.poll();
            low = heap.poll();
            if(max!=low){
                heap.offer(max-low);
            }
        }

        return heap.isEmpty()?0:heap.poll();
        
    }
}
