class	Mobile3{
int	mobile_cost;
String	model_name;
String	mobile_color;
Mobile3(int	mobile_cost,String	model_name,String	mobile_color){
	this.mobile_cost=mobile_cost;
	this.model_name=model_name;
	this.mobile_color=mobile_color;
}
public	static	void	main(String[]	args){
Mobile3	m3=new	Mobile3(70000,"Iphone	15","Pink");
System.out.println(m3.mobile_cost);
System.out.println(m3.model_name);
System.out.println(m3.mobile_color);
}
}