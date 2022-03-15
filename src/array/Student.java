package array;

public class Student {
String  name;
int rollno;
String address;

public Student(String name,int rollno, String address) {
	this.name=name;
	this.rollno=rollno;
	this.address=address;
	}

@Override
public String toString() {
	return "Student [name=" + name + ", rollno=" + rollno + ", address=" + address + "]";
}

}