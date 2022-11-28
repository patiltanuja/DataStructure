import java.util.Scanner;
public class Main
{
    int arr[];
    int rear;
    int front;
    int count =0;
    int size;
    
    Main(int size){
        this.size=size;
        this.arr=new int[size];
        this.rear=0;
        this.front=0;
    }
    public void insert(int x){
        if(count==size){
            return;
        }
        rear=rear%size;
        arr[rear]=x;
        count++;
        rear++;
         System.out.println("Inserted element"+x+ " "+rear);
    }
    public int delete(){
        if(count==0){
            return -1;
        }
        System.out.println("Inside Deleted block front value : "+front);
        System.out.println("Inside Deleted block counter value : "+count);
        front=front%size;
        
        System.out.println("Deleted element "+arr[front]+" "+front);
        count--;
        front++;
        return arr[front];
    }
    public int top(){
        return arr[front%size];
    }
   
	public static void main(String[] args) {
		System.out.println("Enter size.");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		Main obj= new Main(n);
		System.out.println(obj.count);
		obj.insert(8);
			obj.insert(90);
				obj.insert(89);
				//	obj.insert(87);
						obj.delete();
						
		System.out.println(obj.top());
	}
}
