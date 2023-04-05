// 課題1-29
import info.Prefecture;
import utils.PrefectureComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Prefecture> prefectures = new ArrayList<>();
        prefectures.add(new Prefecture(0, "北海道", "札幌市", 83424));
        prefectures.add(new Prefecture(1, "青森県", "青森市", 9646));
        prefectures.add(new Prefecture(2, "岩手県", "盛岡市", 15275));
        prefectures.add(new Prefecture(3, "宮城県", "仙台市", 7282));
        prefectures.add(new Prefecture(4, "秋田県", "秋田市", 11638));
        prefectures.add(new Prefecture(5, "山形県", "山形市", 9323));
        prefectures.add(new Prefecture(6, "福島県", "福島市", 13784));
        prefectures.add(new Prefecture(7, "茨城県", "水戸市", 6097));
        prefectures.add(new Prefecture(8, "栃木県", "宇都宮市", 6408));
        prefectures.add(new Prefecture(9, "群馬県", "前橋市", 6362));
        prefectures.add(new Prefecture(10, "埼玉県", "さいたま市", 3798));

        Scanner scanner = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();
        String line;
        System.out.println("都道府県の番号を入力してください (qで終了):");
        while (!(line = scanner.nextLine()).equalsIgnoreCase("q")) {
            try {
                input.add(Integer.parseInt(line));
            } catch (NumberFormatException e) {
                System.out.println("無効な入力です");
            }
        }

        System.out.println("昇順でソートする場合は1、降順でソートする場合は2を入力してください:");
        int sortOrder = scanner.nextInt();

        boolean ascending = sortOrder == 1;
        PrefectureComparator comparator = new PrefectureComparator(ascending);
        input.sort((i1, i2) -> comparator.compare(prefectures.get(i1), prefectures.get(i2)));

        for (int id : input) {
            Prefecture p = prefectures.get(id);
            System.out.println("都道府県名：" + p.getName());
            System.out.println("県庁所在地：" + p.getCapital());
            System.out.println("面積：" + p.getArea() + "km2");
            System.out.println();
        }

        scanner.close();
    }
}

