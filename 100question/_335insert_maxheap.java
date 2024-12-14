import java.util.ArrayList;

public class _335insert_maxheap {

    public static void swap(ArrayList<Integer>heap  ,  int l , int r ){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }
    public static void push_up_max_heap(ArrayList<Integer> heap , int index){
        // first find the parent index : 
        int parent_index = (index - 1)/2;

        // if our element is present on correct position : then return 
        if(index == 0 || heap.get(parent_index) > heap.get(index)){
            return;
        }

        // if we are not in correct posititon : 
        swap(heap , parent_index , index);

        // push up : 
        push_up_max_heap(heap, parent_index);
        
    }
    public static void insert_max_heap(ArrayList<Integer> heap , int element){
        // first insert at last : 
        heap.add(element);

        //push up the heap : 
        int index = heap.size() - 1;

        push_up_max_heap(heap , index);
    }
    public static void main(String[] args) {

        ArrayList<Integer> heap = new ArrayList<>();
        heap.add(9);
        heap.add(8);
        heap.add(7);
        heap.add(6);
        heap.add(5);
        heap.add(4);
        heap.add(3);
        System.out.println(heap);
        insert_max_heap(heap, 10);
        System.out.println(heap);
    }
    
}
