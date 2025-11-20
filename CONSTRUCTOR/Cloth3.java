class Cloth3 
{
		String cloth_color;
		int cloth_cost;
		String cloth_size;
		Cloth3(String	a,String	b,int	c){
		cloth_color=a;
		cloth_cost=c;
		cloth_size=b;
		}
	public static void main(String[] args) 
	{
	Cloth3	c3=new	Cloth3("Red","L",2000);
		System.out.println(c3.cloth_color);
		System.out.println(c3.cloth_cost);
		System.out.println(c3.cloth_size);
	}
}
