package Lec_01;

public class Report_card {
	public static void main(String[] args) {
		int marks = 87;
		if (70 <= marks && marks < 80) {
			System.out.println("C");
		} else if (60 <= marks && marks < 70) {
			System.out.println("D");
		} else if (50 <= marks && marks < 60) {
			System.out.println("E");
		} else if (marks >= 90) {
			System.out.println("A");
		} else if (80 >= marks && marks < 90) {
			System.out.println("B");
		} else {
			System.out.println("F");
		}
		System.out.println(marks);
	}
}
