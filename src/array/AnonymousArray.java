package array;

 class AnonymousArray {
static void sum(int[]a) {
	int total=0;
	
	for(int i:a)
		total=total+i;
	System.out.println("The sum of array is"   +   total);
	}

	public static void main(String[]args) {
		sum(new int[] {1,2,3});
	}
	
}

