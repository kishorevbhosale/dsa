package leetcode;

public class BrokenLetter {
    public static void main(String[] args) {
        String s = "hello world";

    }
    public static int canBeTypedWords(String text, String brokenLetters) {
        char[] c = brokenLetters.toLowerCase().toCharArray();
        int count = 0;
        for (String str : text.split(" ")){

            System.out.println(str.toLowerCase());
            for (int i = 0; i < c.length; i++) {
                String s = Character.toString(c[i]);
                if (str.contains(s)){
                    count++;
                    break;
                }
            }
        }
        return text.split(" ").length-count;
    }
}
