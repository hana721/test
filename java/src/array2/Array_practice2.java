package array2;

public class Array_practice2 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//課題1-14
	    String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
	    for (int i = 0; i < alphabet.length; i++) {
	        if (alphabet[i].equals("i")) {
	            continue;
	        }
	        System.out.println(alphabet[i]);
	    }
	}
}