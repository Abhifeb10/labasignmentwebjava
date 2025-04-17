package Lab;

import java.net.MulticastSocket;
import java.util.Collection;
import java.util.Scanner;

import Example.jdbc.jdbcDao;

public class SimpleSelectQureryMain {

	
	
	public static void getall() {
		jdbcDao<Student, Integer> dao = new StudentDao();
		Collection<Student> studentlist = dao.getAll();
		for (Student student : studentlist)
			System.out.println(student);
	}

	public static void getone() {
		jdbcDao<Student, Integer> dao = new StudentDao();
		System.out.println("enter the entry wanted from the table (rollno)");
		Scanner sc= new Scanner(System.in);
		int g=sc.nextInt();
		Student students = dao.getone(g);
		System.out.println(students);

	}

	public static void insert() {
		
		jdbcDao<Student, Integer> dao = new StudentDao();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the rollno");
		int r=sc.nextInt();
		System.out.println("enter the Name");
		String n=sc.next();
		System.out.println("enter the city");
		String c=sc.next();
		Student students = new Student(r, n, c);
		dao.add(students);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	while(true)
	{
	System.out.println("\n1.getall \n2.getone \n3.insert\n0.exist");
	System.out.println("enter the choice");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
	{
		getall();
		break;
	}
	case 2:
	{
		System.out.println("--------------------");
		getone();
	}
		break;
	case 3:	
	{
		System.out.println("--------------------");
		insert();
		break;
	}
	case 0:
	{
		break;
	}
		default :
		{
			System.out.println("enter vaild choice");
			break;
		}
	}
	}
	}

}
