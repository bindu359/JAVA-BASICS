  class Phonepe
{
	void send(int Amount)
{
System.out.println("Sending Amount");
}
void send(String msg)
{
System.out.println("Sending Message");
}


public static void main(String [] args)
	{
Phonepe p=new Phonepe();
p.send(2000);
p.send("Hello");


}
}

