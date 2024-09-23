package Inheritance;

public class parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		/*
		 * 
		 * inheritance: process in which one class acquires properties of other class
		 * 
		 * parent/super/base:   class whose properties are inherited
		 * child/sub/derived:   class which uses properties of parent 
		 * 
		 * child is using parent
		 * to achieve:  child class definition: extends parentname
		 * 
		 * single:   parent<=> chikld
		 * multiple: multiparents<=> child , java will not support it
		 * hierrrarchial: parent<=> child1, child2
		 * multilever: parent<=> child<=> grandchild
		 * /*
 * single      parent<-> child
 * multiple    parent1,parent2=> child is not possible in java
 * hierrarch   parent<=> child1,child2/....
 * multilevel: parent<=> child<=> grandchild 
 ** 
 * 
 * */
parent.ps();
parent p = new parent();
p.pn();
	}
	public static void ps()
	{
		System.out.println("Parent Static method");
	}
	public void pn()
	{
		System.out.println("Parent non static method");
	}

}
