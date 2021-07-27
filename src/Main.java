import java.util.*;

public class Main {

    Main(){
        System.out.println("Constructor");
    }

    private static final int value;

    static {
        System.out.println("static block");
        value = 2; // final can be modified here
    }

    {
        System.out.println("Instance block");
        System.out.println(value);
    }

    public static void main(String[] args) {
        Main main = new Main();
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
