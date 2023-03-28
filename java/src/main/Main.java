package main;

import status.Status;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("名前を入力してください：");
        String name = scanner.nextLine();
        Status status = new Status();
        System.out.println("こんにちは " + name + " さん");
        System.out.println(status.getStatusMessage());
        System.out.println("さあ冒険に出かけよう！");
    }
}





