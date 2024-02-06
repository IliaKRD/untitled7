import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<Integer>();

        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(4);

        HashSet<Integer> myHashSet2 = new HashSet<Integer>();

        myHashSet2.add(4);
        myHashSet2.add(5);
        myHashSet2.add(6);
        myHashSet2.add(7);

        HashSet<Integer> unionSet = union(myHashSet, myHashSet2);
        System.out.println("Объединение: " + unionSet);

        HashSet<Integer> intersectSet = intersect(myHashSet, myHashSet2);
        System.out.println("Пересечение: " + intersectSet);
    }

        private static <T> HashSet<T> union(HashSet<T>...sets)
        {
            HashSet<T> unionSet = new HashSet<T>();
            for (Set<T> set : sets) {
                unionSet.addAll(set);
            }
            return unionSet;
        }

        private static <T> HashSet<T> intersect(HashSet<T>...sets)
        {
            if (sets.length == 0) {
                return new HashSet<>();
            }
            else
            {
                HashSet<T> intersectSet = new HashSet<>(sets[0]);
                for (int i = 1; i < sets.length; i++) {
                    intersectSet.retainAll(sets[i]);
                }
                return intersectSet;
            }
        }
    }
