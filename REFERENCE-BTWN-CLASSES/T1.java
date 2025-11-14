class	Type1{
	int	area(){
	int	a=10;
	int	res=a*a;
	return	res;
	}
}
class	T1{
	public	static	void	main(String[]	args){
	Type1	t1=new	Type1();
	int	x=t1.area();
	System.out.println(x);
	}

}