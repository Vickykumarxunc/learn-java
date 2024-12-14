import java.util.ArrayList;

public class _337deletion_maxheap {
    public static void swap(ArrayList<Integer> heap , int l , int r){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }
    public static void push_down(ArrayList<Integer> heap , int index){
        
        // size of the heap 
        int n = heap.size();

        // base case : if we reach the at the end of tree return : 
        if(index == n){
            return;
        }

        // find the child : 
        int left_child = (2 * index) + 1;
        int right_child = (2 * index) + 2;
        int largest = index;

        // comapre with the children : 

        // compare with the left childre : 
        if(left_child <= n && heap.get(left_child) > heap.get(largest)){
            largest = left_child;
        }
        if(right_child <= n && heap.get(right_child) > heap.get(largest)){
            largest = right_child;
        }

        // if we reach the correct position return 
        if (largest == index) {
            return;
        }
        // else: swap: 
        swap(heap, index , largest);

        // push down : 
        push_down(heap , largest);

    }
    public static void delete_maxheap(ArrayList<Integer> heap){
        // size of the heap 
        int n = heap.size();

         // first swap the first and last element : 
         swap(heap , 0 , n - 1);

         // remove the last element : 
         heap.remove( n - 1);

         // pushdown 
         push_down(heap , 0);
    }
    public static void main(String[] args) {
        ArrayList<Integer> heap = new ArrayList<>();
        heap.add(90);
        heap.add(80);
        heap.add(70);
        heap.add(20);
        heap.add(10);
        heap.add(50);
        heap.add(60);
        System.out.println(heap);
        delete_maxheap(heap);
        System.out.println(heap);
    }
    
}
