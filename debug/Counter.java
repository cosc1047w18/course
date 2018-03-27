package debugexample;

public class Counter {
	private int result = 0;

	public int getResult() {
		return result;
	}

	public void crazyCount() {
		int x = 1337;
		int y = -17;
		int z = 326;
		for (int i = 0; i < 20; i++) {
			z *= 2;
			x /= 2;
			y -= 6;
			x += y;
			result += i + x + y + z;
		}
	}
}
