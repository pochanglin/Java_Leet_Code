package problem;

/**
 * 622. Design Circular Queue
 * 
 * Your implementation should support following operations:
 * 
 * 	MyCircularQueue(k): Constructor, set the size of the queue to be k.
 * 	Front: Get the front item from the queue. If the queue is empty, return -1.
 * 	Rear: Get the last item from the queue. If the queue is empty, return -1.
 * 	enQueue(value): Insert an element into the circular queue. Return true if the operation is successful.
 * 	deQueue(): Delete an element from the circular queue. Return true if the operation is successful.
 * 	isEmpty(): Checks whether the circular queue is empty or not.
 * 	isFull(): Checks whether the circular queue is full or not.
 * 
 * */
public class Problem0622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class MyCircularQueue{
		int head, tail = 0;
		int[] arr;
		int size;
		int count;
		
		public MyCircularQueue(int k){
			size = k;
			arr = new int[size];
		}
		
		public boolean enQueue(int value){
			if(this.isFull()) return false;
			count++;
			arr[tail] = value;
			tail = (tail+1) % size;
			return true;
		}
		
		public boolean deQueue(){
			if(this.isEmpty()) return false;
			count--;
			head = (head+1) % size;
			return true;
		}
		
		public int Front(){
			if(this.isEmpty()) return -1;
			return arr[head];
		}
		
		public int Rear(){
			if(this.isEmpty()) return -1;
			return arr[(tail-1 + size) % size];
		}
		
		public boolean isEmpty(){
			return count == 0;
		}
		
		public boolean isFull(){
			return count == size;
		}
	}

}
