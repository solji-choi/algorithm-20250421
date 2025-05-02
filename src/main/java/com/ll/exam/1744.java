import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> nums1 = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();
        List<Integer> ones = new ArrayList<>();
        int index = 1;
        int sum = 0;
        boolean hasZero = false;

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num > 1) {
                nums1.add(num);
            } else if (num < 0) {
                nums2.add(num);
            } else if (num == 1) {
                ones.add(1);
            } else {
                hasZero = true;
            }
        }
        Collections.sort(nums1, Collections.reverseOrder());
        Collections.sort(nums2);

        while(index < nums1.size() && nums1.size() > 1) {
            sum += nums1.get(index - 1) * nums1.get(index);

            if(index == nums1.size() - 2) {
                sum += nums1.get(index + 1);
            }

            index += 2;
        }

        if (nums1.size() == 1) {
            sum += nums1.get(0);
        }

        index = 1;

        while(index < nums2.size() && nums2.size() > 1) {
            sum += nums2.get(index - 1) * nums2.get(index);

            if(index == nums2.size() - 2 && !hasZero) {
                sum += nums2.get(index + 1);
            }

            index += 2;
        }

        if (nums2.size() == 1 && !hasZero) {
            sum += nums2.get(0);
        }

        sum += ones.size();

        System.out.println(sum);
    }
}