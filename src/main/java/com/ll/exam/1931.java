import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] meetings = new int[n][2];

        for(int i = 0; i < n; i++) {
            String[] meeting = br.readLine().split(" ");
            meetings[i][0] = Integer.parseInt(meeting[0]);
            meetings[i][1] = Integer.parseInt(meeting[1]);
        }

        Arrays.sort(meetings, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] != o2[1] ? o1[1] - o2[1] : o1[0] - o2[0];
            }
        });

        int count = 0;
        int meetingEndTime = 0;

        for(int i = 0; i < n; i++) {
            if(meetings[i][0] >= meetingEndTime) {
                count++;
                meetingEndTime = meetings[i][1];
            }
        }

        System.out.println(count);
    }
}