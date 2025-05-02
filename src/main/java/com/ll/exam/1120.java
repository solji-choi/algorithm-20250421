import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        String a = strs[0];
        String b = strs[1];
        int aLength = a.length();
        int bLength = b.length();
        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i <= bLength - aLength; i++) {
            int diffCount = 0;
            
            for(int j = 0; j < aLength; j++) {
                if(b.charAt(i + j) != a.charAt(j)) {
                    diffCount++;
                }
            }

            minDiff = Math.min(minDiff, diffCount);
        }

        System.out.println(minDiff);
    }
}