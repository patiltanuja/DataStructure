public class Main
{   
        
        int sizeOfArray;
        int a[];
        int top;
        
        Main(int sizeOfArray){
            this.sizeOfArray=sizeOfArray;
            this.a= new int[sizeOfArray];
            this.top=-1;
        }
	    void push(int x){
		top++;
	        a[top]=x;
	        System.out.println("printing push element"+x);
	    }
	   public int pop(){
	        if(!isEmpty()){
	        int popElement=top;
	        top--;
	        return a[popElement];
	        }
	        else{
	            return -1;
	        }
	    }
	    int top(){
	        return a[top];
	    }
	    int size(){
	        return top+1;
	    }
	   public boolean isEmpty(){
	        if(top==-1){
	            return true;
	        }else{
	           return false; 
	        }
	    }

	public static void main(String[] args) {
		System.out.println("Stack using Array");
	    //int arr[] = {2,4,6,9,28};
	  //  System.out.println(arr[0]);
	    Main obj= new Main(4);
	    obj.push(10);
	    obj.push(20);
	    obj.push(30);
	    obj.pop();
	    //obj.top();
	    obj.isEmpty();
	  
	}
	
}