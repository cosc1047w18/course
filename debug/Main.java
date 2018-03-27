package debugexample;

public class Main {

	public static void main(String[] args) {
		Counter counter = new Counter();
		counter.crazyCount();
		System.out.println("The result is " + counter.getResult());
	}
}
