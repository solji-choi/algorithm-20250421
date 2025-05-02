import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String p = "IOI";

        for(int i = 1; i < n; i++) {
            p += "OI";
        }

        int count = 0;

        for(int i = 0; i <= m - p.length(); i++) {
            boolean isSame = true;

            for(int j = 0; j < p.length(); j++) {
                if(s.charAt(i + j) != p.charAt(j)) {
                    isSame = false;

                    break;
                }
            }

            if(isSame) {
                count++;
            }
        }

        System.out.println(count);
    }
}