package pe.isil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Luis");
        names.add("Eduardo");
        for (String name : names) {
            System.out.println(name);
        }

        Set<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(10);
        oddNumbers.add(8);
        oddNumbers.add(6);
        System.out.println(oddNumbers);

        Map<String, String> student = new HashMap<>();
        student.put("nombre", "Andrea Pacheco");
        student.put("codigo", "20250506");
        System.out.println(student.get("nombre"));

    }
}