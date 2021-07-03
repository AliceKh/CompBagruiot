import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class One {
    public static void main(String[] args) throws Exception {
        int max = 5;
        int min = 1;
        Random rd = new Random(); 
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(max - min) + min;
        }
        System.out.println("arr = " + Arrays.toString(arr));
        int rnd = new Random().nextInt(arr.length);
        int num = arr[rnd];
        System.out.println("num= "+num);

        System.out.println("filter = " + Arrays.toString(filter(arr, num)));
    }

    public static int[] filter (int[] arr, int num){
        List<Integer> arrnew = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=num) {
                arrnew.add(arr[i]);
            }
        }
        int[] ret = arrnew.stream().filter(i -> i != null).mapToInt(i -> i).toArray();
        return ret;
    }
}


