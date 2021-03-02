import java.util.Scanner;
import java.util.Arrays;
public class Ques1 {
 public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 StringBuffer a = new StringBuffer();
 a.append(s.next());
 int[] ct = new int[256];
 for (int i = 0; i < a.length(); i++) {
 int x = a.charAt(i);
 ct[x]++;
 }
 for (int i = 0; i < ct.length; i++) {
 if (ct[i]!=0) {
 System.out.println("The character "+(char)i+" appears "+ct[i]+" times in the word");
 }
 }
 }
}
