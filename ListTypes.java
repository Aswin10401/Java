import java.util.*;

public class ListTypes {
    //ArrayLists

    public ArrayList<String> ArrayListEg() {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("Mnago");

        return fruits;
    }

    public LinkedList<Integer> LinkedListEg() {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        return numbers;
    }

    public Map<String, Integer> HashMapEg() {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 50);
        scores.put("Bob",60);
        scores.put("charlie",70);

        return scores;
    }

    public Set<String> HashSetEg() {
        HashSet<String> colors = new HashSet<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        return colors;
    }

    public static void main (String [] args) {
        ListTypes l = new ListTypes();
        ArrayList<String> fruitList = l.ArrayListEg();
        LinkedList<Integer> numberList = l.LinkedListEg();
        Map<String, Integer> scoreMap = l.HashMapEg();
        Set<String> colorSet = l.HashSetEg();

        //print results


        System.out.println("Fruits: " + fruitList);
        System.out.println("Numbers: " + numberList);
        System.out.println("Scores: " + scoreMap);
        System.out.println("Colors: " + colorSet);
    }
}
