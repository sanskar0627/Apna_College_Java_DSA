import java.util.*;

public class insert {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int x = arr.size() - 1;
            int par = (x - 1) / 2;
            while (arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x = par;
                par = (x - 1) / 2;
            }
        }
        
        public int peek(){
            System.out.println("Min Element in the heap");
            return arr.get(0);
        }
        public int remove(){
            int data=arr.get(0);
            int temp=arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);
            arr.remove(arr.size()-1);
            heapify(0);
            return data;
        }
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minInx=i;
            if(left<arr.size()&&arr.get(minInx)>arr.get(left)){
                minInx=left;
            }
            if(right<arr.size()&&arr.get(minInx)>arr.get(right)){
                minInx=right;
            }
            if(minInx!=i){
                int temp=arr.get(i);
                arr.set(i, arr.get(minInx));
                arr.set(minInx, temp);
                heapify(minInx);
            }

        }
    }

    public static void main(String args[]) {
        Heap minHeap = new Heap();
        minHeap.add(50);
        minHeap.add(30);
        minHeap.add(20);
        minHeap.add(40);
        minHeap.add(10);
        System.out.println("Heap Array: " + minHeap.arr);
        System.out.println(minHeap.peek());
        System.out.println(minHeap.remove());
        System.out.println("Heap Array: " + minHeap.arr);
    }
}
