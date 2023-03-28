package array_tasks;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Map<Integer, Double> list = new HashMap<>();
        //   series A: [(1, 1.0), (2, 1.5), (3, 2.0)]
        //  series B: [(2, 1.0), (3, 2.5), (5, 1.0)]
        list.put(1, 1.0);
        list.put(2, 1.5);
        list.put(3, 2.0);
        Map<Integer, Double> list2 = new HashMap<>();
        list2.put(2, 1.0);
        list2.put(3, 2.5);
        list2.put(5, 1.0);
        Map<Integer, Double> list3 = new HashMap<>();
        Set<Map<Integer, Double>> result = new HashSet<>();
        for (Map.Entry<Integer, Double> integerDoubleEntry : list.entrySet()) {
            list3.put(integerDoubleEntry.getKey(), integerDoubleEntry.getValue());
        }
        System.out.println(list3);
        for (Map.Entry<Integer, Double> integerDoubleEntry : list2.entrySet()) {
            for (Map.Entry<Integer, Double> doubleEntry : list3.entrySet()) {
                if (integerDoubleEntry.getKey() == doubleEntry.getKey()) {
                    list3.put(integerDoubleEntry.getKey(), doubleEntry.getValue() + integerDoubleEntry.getValue());
                }
            }
            if (!list3.containsKey(integerDoubleEntry.getKey())) {
                list3.put(integerDoubleEntry.getKey(), integerDoubleEntry.getValue());
            }


        }
        System.out.println(list3);

    }
}