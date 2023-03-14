package variable;

public class Variable1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		課題1-5
//		問１）
//		コンソールに以下のような自己紹介を自分の情報で出力してください。
//		※但し、「名前、性別、年齢、身長」は変数に代入して、出力するようにしてください。
//		※性別は「男」か「女」の一文字、身長は小数点第一位までのかたちで表示されるようにして下さい。

		String name = "岩下華子";
		String gender = "女";
		int old = 24;
		double height  = 167.5;
		
		System.out.println("私の自己紹介をします。");
		System.out.println("名前は" + (name) + "です。");
		System.out.println("性別は" + (gender) + "です。");
		System.out.println("年齢は" + (old) + "です。");
		System.out.println("身長は" + (height) + "です。");
		System.out.println("よろしくお願いします。");
	}

}
