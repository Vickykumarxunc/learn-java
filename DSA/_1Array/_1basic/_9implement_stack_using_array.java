
 class stack{
    
    int size = 10000;
    int arr[] = new int[size];
    int top = -1;
    
    void push(int x){
        top++;
        arr[top] = x;
    }
    int pop(){
        int x = arr[top];
        top--;
        return x;
    }
    int top(){
        return arr[top];
    }
    int size(){
        return top + 1;
    }
    void display(){
        int temp = top;
        while(temp != -1){
            System.out.print(arr[temp] + " ");
            temp--;
        }
    }
    
}
public class _9implement_stack_using_array {

    public static void main(String[] args) {

        stack st = new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

         st.display();
        System.out.println("top of the stack before deleting any element = "  + st.top());
        System.out.println("size of the stack before deleting any element = " + st.size());
        System.out.println("the deleted element is = " + st.pop());
        System.out.println("size of the stack after deleting an element = " + st.size());


        
    }
    
}
