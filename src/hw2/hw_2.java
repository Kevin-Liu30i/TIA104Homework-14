package hw2;

public class hw_2 {

	public static void main(String[] args) {
		System.out.println("===========1============");

		int sum = 0;

		for (int i = 2; i <= 1000; i += 2) {
			sum += i;
		}
		System.out.println("偶數和為: " + sum);

		System.out.println("===========2============");

		int x = 1;

		for (int i = 1; i <= 10; i++) {
			x *= i;
		}

		System.out.println("乘積為: " + x);

		System.out.println("===========3============");

		int p = 1;
		int i = 1;

		while (i <= 10) {
			p *= i;
			i++;
		}

		System.out.println("乘積為: " + p);

		System.out.println("===========4============");

		for (int y = 1; y <= 10; y++) {
			int yt = y * y;
			System.out.print(yt + " ");
		}
		System.out.println();
		System.out.println("===========5============");

		int K = 0;
		for (int E = 1; E <= 49; E++) {
			if (E % 10 != 4 && E / 10 != 4) {
				System.out.print(E + " ");
				p++;
			}
		}
		System.out.println();

		System.out.println("===========6============");

		for (int Z = 10; Z >= 1; Z--) {

			for (int j = 1; j <= Z; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

		System.out.println("===========7============");

		for (int R = 0; R < 6; R++) {

			char letter = (char) ('A' + R);

			for (int N = 0; N <= R; N++) {
				System.out.print(letter);
			}

			System.out.println();

		}

	}
}
