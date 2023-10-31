import java.util.Scanner;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class Fixer {
    public static void main(String[] Args){
        String sent_in;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sent");
        sent_in = sc.nextLine().trim();
        String new_sent = fixer(sent_in);
        System.out.println(new_sent);
    }

    public static String fixer(String sent){
        StringBuilder fixed_sent = new StringBuilder(sent);
        if (sent.length() > 0) {
            fixed_sent.setCharAt(0, Character.toUpperCase(sent.charAt(0)));
            for (int i = 1; i < sent.length(); i++) {
                fixed_sent.setCharAt(i, Character.toLowerCase(sent.charAt(i)));
            }
            if(!sent.endsWith(".") && !sent.endsWith("?") && !sent.endsWith("!")){
                fixed_sent.append(".");
            }
        }
        return fixed_sent.toString();
    }
}
