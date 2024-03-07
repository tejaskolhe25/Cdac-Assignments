public class Que1 {
    public static void main(String[] args) {

        double array[] = { 5, 4, 3, 9, 1, 7, 9 };

        double sum = 0;
        int i;me 

        

        for (i = 0; i < array.length; i++) {
            sum += array[i];

        }
        double avg = sum / array.length;
        System.out.println("sum of all elements of array:-" + sum);
        System.out.println("avg all elements of array:-" + avg);

    }

}
