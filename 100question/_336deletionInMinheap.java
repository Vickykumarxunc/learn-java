import java.util.ArrayList;

public class _336deletionInMinheap {

    public static void swap(ArrayList<Integer> heap , int l , int r){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);

    }
    public static void push_down(ArrayList<Integer> heap , int index){

        // size of the heap : 
        int n = heap.size() - 1;

        // base case -> if reach at last return : 
        if(index == n){
            return;
        }

        // find the child : 
        int left_child = (2 * index) + 1;
        int right_child = (2 *index)+ 2;
        int smallest = index;

         // compare with the child : 
         // first compare with the left child : 
         if(left_child <= n && heap.get(left_child) < heap.get(smallest)){
            smallest = left_child;
         }
         // compare with the right child : 
         if(right_child <= n && heap.get(right_child) < heap.get(smallest)){
            smallest = right_child;
         }

         // if we reach the correct position : 
         if(smallest == index){
            return;
         }
        // agar parent smallest nahi hai to swap kar do current index se : 
        swap( heap, smallest, index);

        // push down : 
        push_down(heap, smallest);
    }
    public static void delete_minheap(ArrayList<Integer> heap){

        // swap first and last element : 
        swap(heap , 0 , heap.size() - 1);

        // now delete the last element of the heap : which is the first element : 
        heap.remove(heap.size() - 1);

        // push down : 
        push_down(heap , 0);
    }
    public static void main(String[] args) {
        ArrayList<Integer> heap = new ArrayList<>();
        heap.add(5);
        heap.add(20);
        heap.add(10);
        heap.add(40);
        heap.add(50);
        heap.add(30);
        heap.add(60);
        System.out.println(heap);
        delete_minheap(heap);
        System.out.println(heap);


    }
    
}
