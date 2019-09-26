package newCoder;

import java.util.*;

public class Main {
    static int  count;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int K = input.nextInt();
        StringBuilder builder = new StringBuilder();
        findReceive(builder,N,M,K);
        input.close();
    }

    static void findReceive(StringBuilder builder,int numa,int numb,int K){
        if(count==K){
            System.out.println(builder.toString());
            return;
        }
        if (numa>0 && count<K){
            count++;
            findReceive(new StringBuilder(builder.toString()).append('a'),--numa,numb,K);
        }
        if (numb>0 && count<K){
            count++;
            findReceive(new StringBuilder(builder.toString()).append('b'),numa,--numb,K);
        }

    }



    static boolean isZhiShu(int num) {
        if (num > 1 && num <= 3) {
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void zoom1() {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        if (inputStr == null || inputStr.isEmpty()) {
            return;
        }
        StringBuilder resultStr = new StringBuilder();
        int len = inputStr.length();
        int count;
        for (int i = 0; i < len; ) {
            char c = inputStr.charAt(i);
            count = 0;
            while (i < len && inputStr.charAt(i) == c) {
                count++;
                i++;
            }
            resultStr.append(c + "_" + count + "_");
        }
        int resultLen = resultStr.length();
        System.out.println(resultStr.toString().substring(0, resultLen - 1));
    }
}
