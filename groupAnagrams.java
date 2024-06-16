import java.util.*;

public class groupAnagrams {
    
    public List <List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String str:strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String sortedStr = String.valueOf(charArray);

        
            anagramsMap.computeIfAbsent(sortedStr, key-> new ArrayList<>() ).add(str);
      
    }
    return new ArrayList<>(anagramsMap.values()); 
}

public static void main(String [] args) {
    groupAnagrams g = new groupAnagrams();
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    System.out.println(g.groupAnagrams(strs));
}

}
