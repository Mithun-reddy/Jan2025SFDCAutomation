package automationframeworksfdcjan25;

import java.util.Iterator;

public class MultiThreadExample implements Runnable{

	int thread;

	MultiThreadExample(int threadNumber) {
		this.thread = threadNumber;
	}

	public void run() {

		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(i + " thread Number =" + this.thread);

		}

	}

	public static void main(String[] args) {

		MultiThreadExample mt = new MultiThreadExample(1);
		MultiThreadExample mt2 = new MultiThreadExample(2);
		MultiThreadExample mt3 = new MultiThreadExample(3);
		MultiThreadExample mt4 = new MultiThreadExample(4);
		MultiThreadExample mt5 = new MultiThreadExample(5);

		mt.start();
		mt2.start();
		mt3.start();
		mt4.start();
		mt5.start();

	}

}
