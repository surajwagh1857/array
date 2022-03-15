package array;

import java.util.Arrays;

public class HeterogeniousArray {




public static void main(String[]args) {
	String s1="AAA";
	Student std1 = new Student("suraj",10,"kolhapur") ;
	String s2="BBB";
	Student std2 = new Student("ram",20,"mumbai") ;
	String s3="CCC";
	Student std3 = new Student("sham",30,"pune") ;
	
	Object[] elements= {s1,std1,s2,std2,s3,std3};
	System.out.println(Arrays.toString(elements));
	System.out.println("-----------------------------------------------------------");

for (Object o:elements)
{
	if( o instanceof String)
	System.out.println(o);
	}
	System.out.println("------------------------------------------------------------");
	for(Object o:elements){
		if (o instanceof Student)
			System.out.println(o);
	}
	
	}
}





