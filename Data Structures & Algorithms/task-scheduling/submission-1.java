class Task {
    char id;
    int freq;
    int initTime;

    public Task(char id, int freq) {
        this.id = id;
        this.freq = freq;
        this.initTime = 0;
    }

    @Override
    public String toString() {
        return id + ":" + freq + ":" + initTime;
    }
}

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int time = 0;
        int[] freq = new int[26];
        PriorityQueue<Task> pq = new PriorityQueue<>((a, b) -> {
            if (a.initTime == b.initTime)
                return Integer.compare(b.freq, a.freq);
            else
                return Integer.compare(a.initTime, b.initTime);
        });

        for (char c : tasks) freq[c - 'A']++;

        for (int i = 0; i < 26; i++)
            if (freq[i] != 0)
                pq.add(new Task((char) ('A' + i), freq[i]));

        //System.out.println(pq);

        while (!pq.isEmpty()) {
            Task t = pq.peek();
            if (t.initTime <= time) {
                pq.poll();
                if (t.freq > 1) {
                    t.freq--;
                    t.initTime += n + 1;
                    pq.add(t);
                }
            }
            //System.out.println(pq);
            time++;
        }
        return time;
    }
}
