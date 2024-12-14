class queue{
   int front = -1;
   int rare = -1;
   int size = 0;
   int arr[] = new int[100];

   public void push(int x){
    
    if(rare == arr.length - 1){
        System.out.println("queue is full :");
        return;
    }
    if(front == -1){

        // queue is empty : 
        front = rare = 0;
        arr[0] = x;
    }
    else{

        rare++;
        arr[rare] = x;
    }

    size++; // push karne par har baar queue ka size badta jayega : 

   }

   public int remove(){

    if(size == 0){
        System.out.println("queue is empty : ");
        return -1;
    }
    front++;
    size--;
    return arr[front - 1];
   }

   public int peek(){

    if(size == 0){
        System.out.println("queue is empty : ");
        return -1;
    }
    return arr[front];
   }

   public boolean isEmpty(){

    if(size == 0){
        return true;
    }
    else{
        return false;
    }

   }

   public void display(){

    if(size == 0){
        System.out.println("queue is empty : ");
    }
    else{
        for(int i = front; i<= rare; i++){
            System.out.print(arr[i] + " ");
        }
    }
    System.out.println();
   }


}
public class _11implementation_queue_using_array {
    public static void main(String[] args) {

        queue q = new queue();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);

        System.out.println("size of the queue before deleting the element = " + q.size);
        System.out.println("removal element = " + q.remove());
        System.out.println("queue is empty or not = " + q.isEmpty());
        System.out.println("top element in the queue = " + q.peek());


        
    }
}
