import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arrayLength = Integer.parseInt(br.readLine());
        Integer[] array = new Integer[arrayLength];

        for(int i = 0; i < arrayLength; i++) {
            int num = Integer.parseInt(br.readLine());
            array[i] = num;
            
            if(num == 0) {
                Arrays.sort(array, Comparator.nullsLast(Comparator.reverseOrder()));

                if(array[i] != null) {
                    System.out.println(array[0]);
                    array[0] = 0;
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}