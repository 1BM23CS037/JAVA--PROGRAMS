//ANJALI PATEL 1BM23CS037

class prime
{
public static void main(String arg[])
{
int num = 37 , i;
boolean flag= false;

if (num == 0 || num == 1)
{
flag= true;
}
for(i=2;i<=num/2;++i)
{
if(num%i==0)
{
flag = true;
break;
}
}
if(!flag){
System.out.println(num + "is a prime number");
}
else{
System.out.println(num + " is not a prime");
}
}
}