package Inheritance;

public class multigrandchild1 extends multic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
multigrandchild1 m = new multigrandchild1();
m.bmi();
multigrandchild1.avg();
m.add();
	}
	public void bmi()
	{
		int b =89;
		int m =7;
		System.out.println("This is grandchild class: Displaying BMI:"+ b/(m*m));
	}

}
