/*import java.util.Scanner;
class A
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
for(int i=0;i<6;i++)
{
for(int j=0;j<6;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}*/
/*2
class A
{
public static void main(String[] args)
{
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(i+"");
}
System.out.println();
}
}
}*/
/*3.
class A
{
public static void main(String[] args)
{
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(j+"");
}
System.out.println();
}
}
}*/
/*4.
class A
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(num+"");
num++;
}
System.out.println();
}
}
}*/
/*5.
class A
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(num+" ");
num++;
if(num>9)
{
num=1;
}
}
System.out.println();
}
}
}*/
/*6.
class A
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(num+" ");
num+=2;
}
System.out.println();
}
}
}*/
/*7.
class A
{
public static void main(String[] args)
{
String pattern ="10101";
System.out.println("pattern");
for(int i=0;i<5;i++)
{
System.out.println(" "+pattern);
}
}
}*/
/*8.
import java.util.Scanner;
class A
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=n-i;j>1;j--)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print("* ");
}
System.out.println();
}
}
}
/*9.
import java.util.Scanner;
class A
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=n-i;j>1;j--)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print(2*j+" ");
}
System.out.println();
}
}
}*/
import java.util.Scanner;
class A
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the word:");
String word=sc.nextLine();
for(int i=0;i<word.length();i++)
{
for(int j=0;j<=i;j++)
{
System.out.print(word.charAt(j)+" ");
}
System.out.println();
}
}
}
























