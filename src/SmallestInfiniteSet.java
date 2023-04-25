import java.util.HashSet;
import java.util.PriorityQueue;

class SmallestInfiniteSet {
    int n=1;
    PriorityQueue<Integer>heap;
    HashSet<Integer>myset;
    public SmallestInfiniteSet() {
        int n=1;
        heap=new PriorityQueue<>();
        myset =new HashSet<>();
    }

    public int popSmallest() {
        if (heap.size()==0)
        {
            n++;
            return n-1;
        }
        if (n<heap.peek())
        {
            n++;
            return n-1;
        }
        else {
            myset.remove(heap.peek());
            return heap.poll();
        }
        }

    public void addBack(int num) {
        if (num<n&&!myset.contains(num))
        {
            myset.add(num);
            heap.add(num);
        }
    }
}