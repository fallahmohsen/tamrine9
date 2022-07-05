import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.stream().filter(val -> val > 1).forEach(val -> System.out.println(val));
    }
}
