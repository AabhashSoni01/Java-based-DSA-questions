import java.util.*;

public class Que33 {
    // Group anagrams together

    public static void main(String[] args) {
        System.out.print("Enter the number of strings : ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[no];

        System.out.println("Enter strings : ");
        for (int i = 0; i < strs.length; i++) {
            strs[i] = sc.nextLine();
        }
        sc.close();

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray(); // Convert to char array
            Arrays.sort(chars); // then sort
            String sortedWord = new String(chars); // Convert back to string
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>()); // If sortedWord not in map, add to map
            }
            map.get(sortedWord).add(word); // Add original word to map.get(sortedWord)
        }

        System.out.println("Grouped anagrams : ");
        for (List<String> s : map.values()) {
            System.out.println(s);
        }
    }
}