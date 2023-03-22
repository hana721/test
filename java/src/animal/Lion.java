package animal;

		// TODO 自動生成されたメソッド・スタブ
		public class Lion {
		    // フィールドの定義
		    private String name;
		    private double length;
		    private double speed;
		  
		    // setterメソッドの定義
		    public void setName(String name) {
		        this.name = name;
		    }
		  
		    public void setLength(double length) {
		        this.length = length;
		    }
		  
		    public void setSpeed(double speed) {
		        this.speed = speed;
		    }
		  
		    // getterメソッドの定義
		    public String getName() {
		        return this.name;
		    }
		  
		    public double getLength() {
		        return this.length;
		    }
		  
		    public double getSpeed() {
		        return this.speed;
		    }
		  
		    // mainメソッドの定義
		    public static void main(String[] args) {
		        // Animalクラスのインスタンスを生成
		        Lion lion = new Lion();
		      
		        // setterメソッドを使用して、フィールドに値を設定
		        lion.setName("ライオン");
		        lion.setLength(2.1);
		        lion.setSpeed(80);
		      
		        // getterメソッドを使用して、フィールドの値を取得して、コンソールに出力
		        System.out.println("動物名：" + lion.getName());
		        System.out.println("体長：" + lion.getLength() + "m");
		        System.out.println("速度：" + lion.getSpeed() + "km/h");
		    }
		

	}


