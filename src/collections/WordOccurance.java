package collections;

import java.util.HashMap;

public class WordOccurance {
	public static void main(String[] args)
	{
		String Strl = "Clean World Green World Love World";
		String[] words = Strl.split("");

		HashMap<String, Integer> map1 = new HashMap<String, Integer>();

		for (String word : words) {
			if (map1.get(word) == null) {
				map1.put(word, 1);
			} else {
				int oldoc = map1.get(word);
				map1.put(word, oldoc+1);
			}
			System.out.println(map1);
		}
	}
}
