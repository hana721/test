package animals;


	import java.util.Scanner;

	public class AnimalInfo {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("コンソールに文字を入力してください");
	        String input = scanner.nextLine(); // コンソールからの入力を受け取る

	        String[] animals = input.split(","); // 入力された文字列を「,」で区切って、配列に格納する
	        for (String animal : animals) {
	            String[] animalInfo = animal.split(":");
	            String name = animalInfo[0]; // 動物名を取得する
	            String length = animalInfo[1]; // 体長を取得する
	            String speed = animalInfo[2]; // 速度を取得する

	            String scientificName = ""; // 学名を格納する変数を初期化する
	            
	            // 動物名に応じて学名を設定する
	            switch (name) {
	                case "ライオン":
	                    scientificName = "パンテラ レオ";
	                    break;
	                case "ゾウ":
	                    scientificName = "ロキソドンタ・サイクロティス";
	                    break;
	                case "パンダ":
	                    scientificName = "アイルロポダ・メラノレウカ";
	                    break;
	                case "チンパンジー":
	                    scientificName = "パン・トゥログロディテス";
	                    break;
	                case "シマウマ":
	                    scientificName = "チャップマンシマウマ";
	                    break;
	                case "インコ":
	                    scientificName = "不明";
	                    break;
	                default:
	                    break;
	            }

	            // フォーマットされた文字列を生成し、コンソールに出力する
	            System.out.println("動物名：" + name);
	            System.out.println("体長：" + length + "m");
	            System.out.println("速度：" + speed + "km/h");
	            System.out.println("学名：" + scientificName);
	            System.out.println();
	        }
	    }
	}


