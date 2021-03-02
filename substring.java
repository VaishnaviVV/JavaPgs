import java.util.Scanner;
class feb_10_q2 {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.print("Enter the 1st string:");
String a=in.nextLine();
System.out.print("Enter the 2nd string:");
String b=in.nextLine();
String[] mat1= new String[100];
String[] mat2=new String[100];
int ct1=0,ct2=0;
for(int i=0;i<a.length();i++)
for(int j=i+1;j<=a.length();j++)
mat1[ct1++]=a.substring(i,j);
ct2=0;
for(int i=0;i<b.length();i++)
for(int j=i+1;j<=b.length();j++)
mat2[ct2++]=b.substring(i,j);
int minl=900,maxl=0;
String maxs=new String();
String mins= new String();
for(int i=0;i<ct1;i++) {
String temp=mat1[i];
for(int j=0;j<ct2;j++) {
if(temp.equals(mat2[j])) {
if(mat2[j].length()>maxl) {
maxl=mat2[j].length();
maxs=mat2[j];
}
if(mat2[j].length()<minl) {
minl=mat2[j].length();
mins=mat2[j];
}
}
}
}
System.out.println("Largest Substring:"+maxs);
System.out.println("Length of largest Substring:"+maxl);
System.out.println("Smalles Substring:"+mins);
System.out.println("Length of smalles Substring:"+minl);
}
}
