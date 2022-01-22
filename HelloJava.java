import java.util.*;
public class HelloJava {
    public static void main(String[] args) {
        int[] vals = randomNumber(10, 4);
        int sortierung = 0;

        for(int i = 0; i < vals.length - 1; i++) {
            if (vals[i] < vals[i + 1]) {
                if (sortierung < 0) {
                    sortierung = 0;
                    break;
                } else {
                    sortierung = 1;
                }
            } else if (vals[i] > vals[i + 1]) {
                if (sortierung > 0) {
                    // nicht sortiert
                    sortierung = 0;
                    break;
                } else {
                    sortierung = -1;
                }
            }
        }
        System.out.println(Arrays.toString(vals));
        System.out.println(String.valueOf(sortierung));
    }

    public static int[] randomNumber(int range, int count) {
        int[] arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = randomNumber(range);
        }
        return arr;
    }

    public static int randomNumber(int range) {
        return (int)(Math.random() * range + 1);
    }

    public static int randomNumber() {
        return randomNumber(100);
    }
}