package multidimensional;

public class Practice3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] test = {
			{64,73,69},
			{58,81,75},
			{86,68,79},
			{72,55,80},
		};
		
		for(int i =0; i < test.length; i++) {
			System.out.printf("生徒%d：国語%d点、数学%d点、英語%d点%n",
                    i + 1, test[i][0], test[i][1], test[i][2]);
		}
	}

}
