import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main (String [] args ){
        ArrayList<Integer> arrList = new ArrayList<>(List.of(2,3,4,6,8,11,11,19,24,48,7,321));

        System.out.println(arrList.stream().filter(m -> m % 2 == 0).map(m -> m * m).max(Comparator.naturalOrder()));
    }

}
