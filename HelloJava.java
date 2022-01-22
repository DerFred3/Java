import java.util.*;

public class HelloJava {
    public static void main(String[] args) {
        int range = 20;
        List<Integer> vals = new ArrayList<Integer>();
        for(int i = 0; i < 1000; i++) {
            double draw = Math.random();
            vals.add((int)((draw * range) + 1)); // wo append?
        }
        
        int min, max = min = vals.get(0); // ??? Java, alles okay?
        // int min = vals.get(0), max = min;
        for (Integer val : vals) {
            if (val < min) {
                min = val;
            } else if (val > max) {
                max = val;
            }
        }
        System.out.println(min + " " + max);
    }

    public int[] randomNumber(int range, int count) {
        int[] arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = randomNumber(range);
        }
        return arr;
    }

    public int randomNumber(int range) {
        return (int)(Math.random() * range + 1);
    }

    public int randomNumber() {
        return randomNumber(100);
    }
}