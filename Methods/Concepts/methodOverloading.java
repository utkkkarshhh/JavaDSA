public class methodOverloading {

	static int max(int x, int y) {
		return x > y ? x : y;
	}

	public static void main(String[] args) {
		int x = 10, y = 20;
		System.out.println(max(x, y));
	}
}