class	Mobile3{
int	mobile_cost;
String	model_name;
String	mobile_color;
Mobile3(int	a,String	b,String	c){
	mobile_cost=a;
	model_name=b;
	mobile_color=c;
}
public	static	void	main(String[]	args){
Mobile3	m3=new	Mobile3(70000,"Iphone	15","Pink");
System.out.println(m3.mobile_cost);
System.out.println(m3.model_name);
System.out.println(m3.mobile_color);
}
}