package sub;

import util.Prefecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] data = {
                "北海道:札幌市:83424",
                "青森県:青森市:9646",
                "岩手県:盛岡市:15275",
                "宮城県:仙台市:7282",
                "秋田県:秋田市:11638",
                "山形県:山形市:9323",
                "福島県:福島市:13784",
                "茨城県:水戸市:6097",
                "栃木県:宇都宮市:6408",
                "群馬県:前橋市:6362",
                "埼玉県:さいたま市:3798"
        };

        List<Prefecture> prefectureList = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            prefectureList.add(new Prefecture(i, data[i]));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("昇順(0)か降順(1)を入力してください。複数選択可。");
        int order = scanner.nextInt();

        Collections.sort(prefectureList);
        if (order == 1) {
            Collections.reverse(prefectureList);
        }

        System.out.println("数字を入力してください。");
        while (scanner.hasNextInt()) {
            int index = scanner.nextInt();
            if (index >= 0 && index < prefectureList.size()) {
                Prefecture pref = prefectureList.get(index);
                System.out.println("都道府県名：" + pref.getName());
                System.out.println("県庁所在地：" + pref.getCapital());
                System.out.println("面積：" + pref.getArea() + "km2");
                System.out.println();
            } else {
                System.out.println("無効な数字です。");
            }
        }
    }
}

