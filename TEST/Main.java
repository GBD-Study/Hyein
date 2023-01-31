// BJ_9935
// 문자열 폭발

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String str;
    static String explosionStr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
        String[] strArray = str.split("");

        explosionStr = br.readLine();
        String[] expArray = explosionStr.split("");

        StringBuilder result = new StringBuilder();

        Integer exist;

        for(String s : strArray) {
            exist = 0;
            for(String e : expArray) {
                if(s.equals(e)) {
                    exist = 1;
                }
            }
            if(exist == 0) {
                result.append(s);
            }
        }

        if(result.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(result);
        }

    }
}