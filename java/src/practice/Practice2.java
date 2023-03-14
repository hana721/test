package practice;

public class Practice2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//     課題1-10
//		問題.for文を使用して九九の計算を出力してください。
//		※出力例 	1×1=1 1×2=2…1×9=9
//					2×1=2 2×2=4…2×9=18
//							・
//							・
//							・
//					9×1=9 9×2=18…9×9=81
//					*/
					
		for (int x = 1; x <= 9; x++) { 
            for (int y = 1; y <= 9; y++) { 
                System.out.print(x + "×" + y + "=" + (x * y) + " "); // 計算結果を出力
            }
            System.out.println(); 
        }
	}

}
