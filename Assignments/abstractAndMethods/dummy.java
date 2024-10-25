package abstractAndMethods;

public class dummy {

	public static void main(String[] args) {
		System.out.println("HII");
		System.out.println(punishmentNumber(10));
	}

	public static int punishmentNumber(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (check(0, i, 0, (i * i) + ""))
				count++;
		}
		return count;
	}

	private static boolean check(int idx, int n, int s, String string) {
		// TODO Auto-generated method stub

		if (idx == string.length()) {
			if (n == s)
				return true;
			return false;
		}
		for (int j = idx; j < string.length(); j++) {
			if (check(j + 1, n, s + (Integer.parseInt(string.substring(idx, j + 1))), string))
				return true;
		}

		return false;
	}

}
