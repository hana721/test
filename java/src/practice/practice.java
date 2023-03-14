package practice;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		課題1-10
//		問題.for文を使用し、以下のプログラムを作成してください。
//		①変数iに1を代入
//		②変数iに2ずつ足す処理を10回繰り返す。
//			出力結果：  3
//						5
//						7
//						9
//						・
//						・
//						・
//						21
//
//		*/
		int i = 1;
		for (int j = 1; j <= 10; j++) { // for文で10回繰り返す
            i += 2; // 変数iに2を足す処理を実行
            System.out.println(i); // 結果を出力
        }

	}

}
