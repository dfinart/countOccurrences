class Main
{
	private static int countOccurrences(String str, char ch) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == ch) {
				counter++;
			}
		}

		return counter;
	}

	public static void main(String[] args)
	{
		String str = "ABAACBDD";
		char ch = 'A';

		System.out.println("Символ " + ch + " встресается " + countOccurrences(str, ch) + " раз.");
	}
}
