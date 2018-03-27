package debugexample;

public class numexampletwo {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;

		while (x < 10) {
			x++;
			y += 1;
			z *= 2;
		}

		System.out.println("x:" + x + "y:" + y + "z:" + z);
	}
}
