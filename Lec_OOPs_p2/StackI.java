package Lec_OOPs_p2;

public interface StackI extends I2, I3{
	int date = 99; // static and final!!
	
	public void add();
	
	public void push();
	
	public int pop();
}
