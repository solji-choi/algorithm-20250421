import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numCount = Integer.parseInt(br.readLine());
        int[] numbers = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        int numbersLength = numbers.length;
        StringBuilder sb = new StringBuilder();
        boolean isChanged = false;

        for(int i = 0; i < numbersLength; i++) {
            for(int j = i; j < numbersLength; j++) {
                if(numbers[j] > numbers[i]) {
                    sb.append(numbers[j] + " ");
                    isChanged = true;
                    break;
                }
            }

            if(!isChanged) {
                sb.append(-1 + " ");
            }
            isChanged = false;
        }

        System.out.println(sb.toString().trim());
    }
}