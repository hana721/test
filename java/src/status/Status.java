package status;

public class Status {

    private int hp;
    private int mp;
    private int attack;
    private int speed;
    private int defense;

    public Status() {
        this.hp = 849;
        this.mp = 862;
        this.attack = 375;
        this.speed = 937;
        this.defense = 24;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getStatusMessage() {
        return "ステータス\n" +
                "HP：" + hp + "\n" +
                "MP：" + mp + "\n" +
                "攻撃力：" + attack + "\n" +
                "素早さ：" + speed + "\n" +
                "防御力：" + defense;
    }

    @Override
    public String toString() {
        return getStatusMessage();
    }
}
