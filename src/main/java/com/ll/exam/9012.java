import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lineCount = Integer.parseInt(br.readLine());
        String[] ps = new String[lineCount];
        Stack st = new Stack();
        boolean isVaild = true;

        for(int i = 0; i < lineCount; i++) {
            ps[i] = br.readLine();
        }

        for(int i = 0; i < ps.length; i++) {
            for(int j = 0; j < ps[i].length(); j++) {
                if(ps[i].charAt(j) == '(') {
                    st.push("(");
                } else if(ps[i].charAt(j) == ')') {
                    if(st.isEmpty()) {
                        isVaild = false;
                        break;
                    } else {
                        st.pop();
                    }
                }                 
            }

            if(st.isEmpty() && isVaild) {
                ps[i] = "YES";
            } else {
                ps[i] = "NO";
            }

            st.clear();
            isVaild = true;
        }

        for(String str : ps) {
            System.out.println(str);
        }
    }
}