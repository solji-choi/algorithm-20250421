import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] kn = br.readLine().split(" ");
        int k = Integer.parseInt(kn[0]);
        int n = Integer.parseInt(kn[1]);
        int[] lines = new int[k];

        for(int i = 0; i < k; i++) {
            lines[i] = Integer.parseInt(br.readLine());
        }
        
        long low = 1;
        long high = Arrays.stream(lines)
                    .max()
                    .orElse(1);
        long lineCut = 0;

        while(low <= high) {
            long middle = (low + high) / 2;
            long lineCount = 0;

            for(int line : lines) {
                lineCount += line / middle;
            }

            if(lineCount < n) {
                high = middle - 1;
            } else {
                low = middle + 1;
                lineCut = middle;
            }
        }

        System.out.println(lineCut);
    }
}