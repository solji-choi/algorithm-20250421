import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] people = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .sorted()
                            .toArray();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += people[i] * (n - i);
        }

        System.out.println(sum);
    }
}