import java.lang.reflect.Array;

public class Que2 {

    public static void main(String[] args) {

        int array[] = { 5, 4, 3, 9, 1, 7, 9 };
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }

        }
        System.out.println(max);
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }

        }
        System.out.println(min);
    }

}
