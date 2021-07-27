import java.util.*;

public class Main {

    public static void main(String[] args) {
        findDiffAndCommonBetweenLists();
        subList();
        unique();

    }

    private static void unique() {
        List<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "a", "d", "e", "f"));
        Set<String> uniqueSet = new LinkedHashSet<>(listOne);
        System.out.println("Unique :" + uniqueSet);
    }

    private static void subList() {
        // just to remember that it start from 0 and 2 mean from 0 to 2
        List<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        List<String> sublist = listOne.subList(0, 2);
        System.out.println("Sublist : " + sublist);
    }

    private static void findDiffAndCommonBetweenLists() {
        List<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        List<String> listTwo = new ArrayList<>(Arrays.asList("a", "d", "f", "k"));

        listOne.removeAll(listTwo);
        System.out.println("Difference : " + listOne);
        listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));

        listOne.retainAll(listTwo);
        System.out.println("Common : " + listOne);
    }
}
