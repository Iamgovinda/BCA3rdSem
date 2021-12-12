class great{
	public static void main(String[] args){
		int x=1;
		int y=2;
		int z=3;

		/*if(x>y)
		{
			if(x>z)
			{
				System.out.println(x + "is Greatest.");
			}
			else
			{
				System.out.println(y + " is Greatest.");
			}
		}
		else
		{
			if(y>z)
			{
				System.out.println(y+ " is Greatest.");
			}
			else
			{
				System.out.println( z + " is Greatest.");
			}
		}*/

		int max=x>y?x:y;
		int greatest=max>z?max:z;
		System.out.println(max+ " is greater." + greatest + " is greatest.");
	}
}