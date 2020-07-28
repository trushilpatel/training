package Learn;

public class stringExam {
    public static void main(String[] args) {
        String c1 = "India";
        String c2 = "India";
        c1 = "Hello";
        System.out.println(c1.equals(c2));

        c1 = c1.concat(c2);
        System.out.println(c1);
        char c[] = new char[c1.length()];
        char c22[] = c1.toCharArray();
        System.out.println(c22);
        c1.getChars(4,c1.length(),c,3);
        System.out.println((byte)c[1]);
    }
}
