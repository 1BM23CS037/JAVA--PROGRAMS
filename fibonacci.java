//ANJALI PATEL 1BM23CS037


class fibonacci
{
public static void main(String arg[])
{
int n1=0 , n2=1 , n3 , i , count=10;
System.out.print(n1 + " " +n2);
for (i=2;i<count;i++)
{
n3=n1+n2;
System.out.print(" "+ n3);
n1=n2;
n2=n3;
}
}
}