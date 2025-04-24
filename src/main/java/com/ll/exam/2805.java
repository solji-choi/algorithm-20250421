import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] trees = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        int maxHigh = Arrays.stream(trees)
                        .max()
                        .orElse(0);
        int cut = 0;
        int low = 0;
        int high = maxHigh;

        while(low <= high) {
            long treeHigh = 0;
            int middle = (low + high) / 2;

            for(int tree : trees) {
                treeHigh += Math.max(0, tree - middle);
            }

            if(treeHigh < m) {
                high = middle - 1;
            } else {
                low = middle + 1;
                cut = middle;
            }
        }

        System.out.println(cut);
    }
}