//課題1-30 Person クラス　保留分

class Person{
// インスタンスフィールドを定義
private String name;
private int age;
private double height;
private double weight;

// コンストラクタを定義しインスタンスフィールドに値をセット
Person(String name, int age, double height){
	this.name = name;
	this.age = age;
	this.height = height;
}

//アクセサーメソッドを定義
public String getName() {
	return name;
  }

public void setName(String name) {
	this.name = name;
  }

public int getAge() {
	return age;
  }

public void setAge(int age) {
	this.age = age;
  }

public double getHeight() {
	return height;
  }

public void setHeight(double height) {
	this.height = height;
  }

public double getWeight() {
	return weight;
  }

public void setWeight(double weight) {
	this.weight = weight;
  }

public double bmi() {
    double heightInMeters = height / 100.0;
    double bmi = weight / (heightInMeters * heightInMeters);
    return Math.floor(bmi * 10) / 10.0; // 小数点第二位を切り捨てる
}

public void print() {
    System.out.println("名前は" + this.name + "です");
    System.out.println("年は" + this.age + "です");
    System.out.println("BMIは" + this.bmi() + "です");
}

public static void main(String[] args) {
    Person person1 = new Person("鈴木太郎", 20, 170, 60);
    Person person2 = new Person("山田花子", 25, 160, 50);

    person1.print();
    person2.print();

    System.out.println("合計" + Person.count + "人です");
}
//static変数を定義
static int count = 0;

//コンストラクタをオーバーロードし、インスタンス作成ごとにcountをインクリメント
Person(String name, int age, double height, double weight){
	this.name = name;
	this.age = age;
	this.height = height;
	this.weight = weight;
	count++;
}
}
