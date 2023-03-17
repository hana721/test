package dataTypeAndMemory;

public class DataTypeAndMemory {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//課題1-16
		String x = "A";
		System.out.printf(x);
		
		String y = "Hello Java";
		System.out.printf(y);
		
		int fujiElevation = 3776;
		System.out.printf("富士山の標高は " + fujiElevation + "m です。");
		
		double Pi = 3.14;
		System.out.printf("円周率は" + Pi + "です");
		
		int [] nums = {10,100,1000};
		System.out.println(nums[1]);
		
		int[] b = nums;
	    b[1] = 8;
	    
	    System.out.println(nums[1]); 
	    System.out.println(b[1]);
	}

}
