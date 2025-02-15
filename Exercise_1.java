// Time Complexity : O(1)
// Space Complexity : O(1)
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top;
    int[] a = new int[MAX]; // Maximum size of Stack
  
    boolean isEmpty() 
    { 
        return top < 0;
    }

    boolean isFull()
    {
        return top >= MAX;
    }

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x)
    {
        if(isFull()) {
            System.out.println("Stack Overflow");
            return false;
        } else{
            a[++top] = x;
            return true;
        }
    }
  
    int pop() 
    {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        } else return a[top--];
    }
  
    int peek() 
    { 
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else
            return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String[] args)
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
