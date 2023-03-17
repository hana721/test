package basicClass;
//課題1-19
public class Dog {
    private String name = "犬"; // nameフィールドの初期値を設定
    private int count; // countフィールドの初期値は0とする

    public Dog() {
    }

    public Dog(int count) {
        this.count = count;
    }

    // nameフィールドのgetter/setterメソッド
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // countフィールドのgetter/setterメソッド
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
