package Learn;

public class stringBufferExa {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Trushil");

        sb.append(" Kem Cho");
        System.out.println(sb);

        sb.appendCodePoint(56);
        System.out.println(sb);

        sb.insert(0, "Patel ");
        System.out.println(sb);

        sb.deleteCharAt(21);
        System.out.println(sb);

        sb.appendCodePoint(57);
        System.out.println(sb);

        System.out.println(sb.capacity());
        StringBuffer sb2 = new StringBuffer();
        System.out.println("New String buffer capacity is " + sb2.capacity());

        System.out.println(sb.codePointCount(0,10));
    }


}
