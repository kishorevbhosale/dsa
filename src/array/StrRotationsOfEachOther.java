package array;

public class StrRotationsOfEachOther {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDBA";
        String tmp = str1.concat(str2);
        if (tmp.contains(str2)) {
            System.out.println("strings are rotations of each other");
        } else {
            System.out.println("strings are not rotations of each other");
        }
    }
}
