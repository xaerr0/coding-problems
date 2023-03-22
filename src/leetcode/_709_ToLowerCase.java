package leetcode;

public class _709_ToLowerCase {
    public static void main(String[] args) {
        System.out.println(toLowerCase2("HoW AwEsOmE"));
    }

    public String toLowerCase(String s) {
        String str;
        return str = s.toLowerCase();

    }

    // without library methods
    public static String toLowerCase2(String s) {

        s = "HoW AwEsOmE";
        //
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] += 'a' - 'A';
            }
        }
        return String.valueOf(arr);
    }
}