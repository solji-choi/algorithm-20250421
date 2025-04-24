import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nArr = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        Arrays.sort(nArr);
        int m = Integer.parseInt(br.readLine());
        int[] mArr = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        
        for(int mNum : mArr) {
            int low = 0;
            int high = n - 1;
            boolean isChecked = false;

            while(low <= high) {
                int middle = (low + high) / 2;

                if(mNum < nArr[middle]) {
                    high = middle -1;
                } else if(mNum > nArr[middle]) {
                    low = middle + 1;
                } else {
                    System.out.println(1);
                    isChecked = true;
                    break;
                }
            }

            if(!isChecked) {
                System.out.println(0);
            }
        }
    }
}