import java.util.ArrayList;

class Main{
	
	public static void main(String[] args){
		Integer[] list = {2,1,3};
		
		list[0] = list[1] = list[0];
		
		System.out.println("0:" + list[0] + " 1:" + list[1] + " 2:" + list[2]);
	}
}