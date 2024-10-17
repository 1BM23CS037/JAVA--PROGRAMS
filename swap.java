//ANJALI PATEL 1BM23CS037

class swap
{
public static void main(String arg[]){
int x=10 ,y=20;
System.out.println("the value of x before swap is" + x);
System.out.println("the value of y before swap is" + y);

int temp=x;
x=y;
y=temp;

System.out.println("the value of x after swap " + x);
System.out.println("the value of y after swap " + y);
}
}