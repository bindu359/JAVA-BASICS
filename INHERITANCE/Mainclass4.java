class	Sample5{
int	x=45;
}
class	Demo5	extends	Sample5{
int	y=25;
}
class	Cool5	extends	Sample5{
int	z=80;
}
class	Tester5	extends	Demo5{
void	disp(){
System.out.println("Hiiiiiii");
}
}
class	Mainclass4{
public	static	void	main(String[]	args){
Cool5	c5=new	Cool5();
Tester5	t5=new	Tester5();
t5.disp();
System.out.println(t5.y);
System.out.println(c5.z);
System.out.println(c5.x);
}
}