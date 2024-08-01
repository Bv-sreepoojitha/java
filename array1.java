import java.util.*;

public class array1 {
	int  m1() {
		int a=10;
		System.out.println(a);
		a--;
		return m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array1 ob=new array1();
		ob.m1();
	}

}
