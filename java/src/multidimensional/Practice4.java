package multidimensional;

public class Practice4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] test = {
	            {64, 73, 69},
	            {58, 81, 75},
	            {86, 68, 79},
	            {72, 55, 80}
	        };
	        
	        int numOfStudents = test.length; // 生徒数
	        int numOfSubjects = test[0].length; // 科目数（全生徒共通）
	        int[] sumOfEachSubject = new int[numOfSubjects]; // 各科目の合計点数
	        
	        // 各科目の合計点数を求める
	        for (int i = 0; i < numOfStudents; i++) {
	            for (int j = 0; j < numOfSubjects; j++) {
	                sumOfEachSubject[j] += test[i][j];
	            }
	        }
	        
	        // 各科目の平均点を求め、表示する
	        for (int i = 0; i < numOfSubjects; i++) {
	            double average = (double) sumOfEachSubject[i] / numOfStudents;
	            System.out.printf("%sの平均点は%.1f点です。%n", getSubjectName(i), average);
	        }
	    }
	    
	    // 科目の名前を取得するメソッド
	    public static String getSubjectName(int index) {
	        String[] subjectNames = {"国語", "数学", "英語"};
	        return subjectNames[index];
	    }
	
	}


