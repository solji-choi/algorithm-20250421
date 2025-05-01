import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nc = br.readLine().split(" ");
        int n = Integer.parseInt(nc[0]);
        int c = Integer.parseInt(nc[1]);
        int[] houses = new int[n];

        for(int i = 0; i < n; i++) {
            houses[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(houses);

        long low = houses[0];
        long high = houses[n - 1];
        long distance = 0;

        while(low <= high) {
            long mid = (low + high) / 2;
            
        }
    }
}