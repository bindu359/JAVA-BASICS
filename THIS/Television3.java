class  Television3
{
		int tv_cost;
		String tv_brand;
		String tv_type;
		Television3(int	tv_cost,String	tv_brand,String	tv_type){
			this.tv_cost=tv_cost;
			this.tv_brand=tv_brand;
			this.tv_type=tv_type;
		}	
	public static void main(String[] args) 
	{
		Television3	t3=new	Television3(499,"Samsung","Smart TV");
		System.out.println(t3.tv_cost);
		System.out.println(t3.tv_brand);
		System.out.println(t3.tv_type);
	}
}
