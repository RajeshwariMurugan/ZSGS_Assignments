package evaluation3;

public class FindIndex {

	public static void main(String[] args) {
		String input = "thistest123string123";
		String indexStr = "123";
		int k = 0;
		String temp = "";

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == indexStr.charAt(k++)) {
				temp += input.charAt(i);

			} else {
				temp = "";
				k = 0;
			}

			if (temp.equals(indexStr)) {
				System.out.println(i - indexStr.length()+1);
				break;
			}
		}

		if (!temp.equals(indexStr)) {
			System.out.println("-1");
		}
	}
}
