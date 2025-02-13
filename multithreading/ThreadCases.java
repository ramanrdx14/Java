package multithreading;

class MyThread3 extends Thread{
	@Override
	public void run() {
		System.out.println("Hi - "+Thread.currentThread().getName());
	}
}
public class ThreadCases {

	public static void main(String[] args) {
		MyThread3 mt3 = new MyThread3();
		MyThread3 mt31 = new MyThread3();
		//mt3.start(); //single task from single thread
		
		
		/*
	   		mt3.start();   multiple thread single task
	  		mt31.start();
	  		
	  		
	  	*/
		
		
		/*
		 * 
		 * 3rd case is not possible
		 * 
		 */
		
		
		/*
		 * 
		 * 4th case easy hai multiple thread create karna hai 
		 */

	}

}
