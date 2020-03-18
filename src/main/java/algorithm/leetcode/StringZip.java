package algorithm.leetcode;

public class StringZip {
    public static String stringZip(String a) {
        String ans = "";
        if (a.equals(null)) {
            return "error";
        } else {
            char[] b = a.toCharArray();
            System.out.println(b.length + "the len of");
            for (int i = 0; i < b.length; i++) {
                int count = 0;
                while (i + count < b.length && b[i + count] == b[i]) {
                    count++;
                }
                System.out.println(count + "--before---" + b[i]);
                if (count!=1) {
                    ans += count + "" + b[i];
                    i = i + count - 1;
                } else {
                    ans += "" + b[i];
                    i = i + count - 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] s) {
        System.out.println(stringZip("hhhhellli"));

    }

}
