package adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Enumeration<String> enumeration = names.elements();

        // Client는 Enumeration을 모르고 Iterator만 사용한다.
        Iterator<String> iterator = new EnumerationIterator<>(enumeration);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
