import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] cards = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();

        for(String card : cards) {
            if(map.get(card) == null) {
                map.put(card, 1);
            } else {
                map.put(card, map.get(card) + 1);
            }
        }

        for(String number : numbers) {
            if(map.get(number) == null) {
                sb.append(0);
            } else {
                sb.append(map.get(number));
            }

            sb.append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}