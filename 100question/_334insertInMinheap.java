import java.util.ArrayList;

public class _334insertInMinheap {

    public static void swap(ArrayList<Integer> heap , int l , int r){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }

    public static void push_up_min_heap(ArrayList<Integer> heap , int index){
        // find the index of parent : 
        int parent_index = (index - 1)/2;

        // until root reached correct position : 
        if(index == 0 || heap.get(parent_index) < heap.get(index)){
            return;
        }

        // if we not reached the correct postion 
        // then swap the parent node and current index node : 
        swap(heap , index , parent_index);

        // and goes the push up by the recursion : 
        push_up_min_heap(heap, parent_index);
    }
    
    public static void insert_Min_heap(ArrayList<Integer> heap , int element){
        // insert at last : 
        heap.add(element);

        // push up the element at min heap : 
        int index = heap.size() - 1;
        push_up_min_heap(heap , index);

    }
    public static void main(String[] args) {
        ArrayList<Integer> heap = new ArrayList<>();
        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(5);
        heap.add(6);
        heap.add(7);
        heap.add(8);

        System.out.println(heap);
        insert_Min_heap(heap, 0);
        System.out.println(heap);
        
    }
    
}
