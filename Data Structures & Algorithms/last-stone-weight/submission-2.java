class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> heap = new PriorityQueue(Collections.reverseOrder());

        for(int wt: stones){
            heap.offer(wt);
        }
        
        while(heap.size()>1){
            int win = heap.poll() - heap.poll();
            if(win!=0){
                heap.offer(win);
            }
        }

        return heap.isEmpty()?0:heap.poll();
        
    }
}
