import java.util.*;
public class Main
{
	static String[][] compute(int b[][],int n,int m)
	{
	    int tot=0;
	    int avg[]=new int[100];
	    String grade[][]=new String[n][m];
	     for(int i=0;i<n;i++)
	     {
	     
	    for(int j=0;j<m;j++)
	    {
	       tot+=b[i][j];
	        
	    }
	    avg[i]=tot/m;
	    tot=0;
	      }
	      
	     for(int i=0;i<n;i++){
	         System.out.println("Avg of subject"+(i+1)+"="+avg[i]);
	     }
	     
	    for(int i=0;i<n;i++)
	    for(int j=0;j<m;j++)
	    {
	        if(b[i][j]-avg[i]>=5)
	        grade[i][j]="A";
	        else if(b[i][j]-avg[i]>=0 && b[i][j]-avg[i]<=4)
	        grade[i][j]="B";
	        else if(b[i][j]-avg[i]<0 && b[i][j]-avg[i]>=-4)
	        grade[i][j]="C";
	        else if(b[i][j]-avg[i]<-5)
	        grade[i][j]="D";
	    }
	    
	    return (grade);
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int m,n;
    
	System.out.println("Enter number of students");
	m=sc.nextInt();
	System.out.println("Enter number of subjects");
	n=sc.nextInt();
	    int p[][]=new int[n][m];
	    String s[][]=new String[n][m];
	    for(int i=0;i<n;i++)
	    for(int j=0;j<m;j++)
	    {
	        p[i][j]=sc.nextInt();
	    }
	
	    s=compute(p,n,m);
	    for(int i=0;i<n;i++)
	    for(int j=0;j<m;j++)
	    {
	        System.out.println("grade of student "+(i+1)+" in subject "+(j+1)+":"+s[i][j]);
	    }

	}
	
	
}
