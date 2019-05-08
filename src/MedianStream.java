import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MedianStream {

    List<Integer> list;
    /** initialize your data structure here. */
    public MedianStream() {
        list=new ArrayList<>();
    }

    public void addNum(int num) {
        int l=0,r=list.size();
        while(l<r){
            int mid=(l+r)/2;
            if(num>=list.get(mid))
                l=mid+1;
            else
                r=mid;
        }
        list.add(l,num);
    }

    public double findMedian() {
        int s=list.size();
        if(s%2!=0) return list.get(s/2);
        else return (double)(list.get(s/2)+list.get(s/2-1))/2;
    }

    public static void main(String[] args) {
        MedianStream ms = new MedianStream();
        ms.addNum(3);
        ms.addNum(7);
        ms.addNum(9);
        ms.addNum(1);
        ms.addNum(4);
        ms.addNum(6);
        System.out.println(ms.findMedian());

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */