import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        // create
        HashMap<Integer, String> map = new HashMap<>();

        // put
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println("after put: " + map);

        // putIfAbsent
        map.putIfAbsent(2, "TwoNew"); // won't replace existing
        map.putIfAbsent(3, "Three");
        System.out.println("after putIfAbsent: " + map);

        // get / getOrDefault
        System.out.println("get(2): " + map.get(2));
        System.out.println("getOrDefault(4, 'Default'): " + map.getOrDefault(4, "Default"));

        // containsKey / containsValue
        System.out.println("containsKey(1): " + map.containsKey(1));
        System.out.println("containsValue('Three'): " + map.containsValue("Three"));

        // remove(key) and remove(key, value)
        map.remove(1);
        System.out.println("after remove(1): " + map);
        boolean removed = map.remove(3, "Wrong"); // false
        System.out.println("remove(3, 'Wrong') returned: " + removed);
        map.remove(3, "Three"); // true
        System.out.println("after remove(3, 'Three'): " + map);

        // replace(key, value) and replace(key, oldValue, newValue)
        map.put(4, "Four");
        map.replace(4, "4"); // simple replace
        map.put(5, "Five");
        boolean replaced = map.replace(5, "No", "FiveUpdated"); // false (oldValue mismatch)
        System.out.println("replace(5, 'No', 'FiveUpdated') returned: " + replaced);
        map.replace(5, "Five", "FiveUpdated");
        System.out.println("after replace ops: " + map);

        // putAll (bulk)
        Map<Integer, String> other = new HashMap<>();
        other.put(6, "Six");
        other.put(7, "Seven");
        map.putAll(other);
        System.out.println("after putAll: " + map);

        // size / isEmpty / clear
        System.out.println("size: " + map.size());
        System.out.println("isEmpty: " + map.isEmpty());

        // views: keySet, values, entrySet
        Set<Integer> keys = map.keySet();
        Collection<String> values = map.values();
        System.out.println("keys: " + keys);
        System.out.println("values: " + values);
        System.out.println("entries:");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println("  " + e.getKey() + " => " + e.getValue());
        }

        // forEach (Java 8+)
        map.forEach((k, v) -> System.out.println("forEach -> " + k + ":" + v));

        // computeIfAbsent, computeIfPresent, compute
        map.computeIfAbsent(8, k -> "Eight");
        map.computeIfPresent(6, (k, v) -> v + "-updated");
        map.compute(7, (k, v) -> (v == null) ? "SevenNew" : v + "#computed");
        System.out.println("after compute* ops: " + map);

        // merge
        map.merge(6, "MERGE", (oldV, newV) -> oldV + "+" + newV);
        map.merge(9, "Nine", (oldV, newV) -> oldV + newV); // adds new key
        System.out.println("after merge ops: " + map);

        // replaceAll
        map.replaceAll((k, v) -> v.toUpperCase());
        System.out.println("after replaceAll (toUpperCase): " + map);

        // clone (shallow) and equals/hashCode
        @SuppressWarnings("unchecked")
        HashMap<Integer, String> copy = (HashMap<Integer, String>) map.clone();
        System.out.println("clone equals original? " + copy.equals(map));
        System.out.println("original hashCode: " + map.hashCode() + ", clone hashCode: " + copy.hashCode());

        // clear
        map.clear();
        System.out.println("after clear, isEmpty: " + map.isEmpty());
    }
}