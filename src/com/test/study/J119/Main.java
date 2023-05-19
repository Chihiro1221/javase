package com.test.study.J119;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Book> LIST;
    private final static String path = "/Users/haonan/IdeaProjects/study/src/com/test/study/J119/data.dat";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        load();
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        while (true) {
            System.out.println("=============== 图书管理系统 ===============");
            System.out.println("1. 录入书籍信息");
            System.out.println("2. 查阅书籍信息");
            System.out.println("3. 删除书籍信息");
            System.out.println("4. 修改书籍信息");
            System.out.println("5. 退出系统");
            System.out.println("======================================");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    insert(scanner);
                    break;
                case 2:
                    list();
                    break;
                case 3:
                    delete(scanner);
                    break;
                case 4:
                    modify(scanner);
                    break;
                case 5:
                    isExit = true;
                    save();
                    System.out.println("感谢你的使用，再见！");
                    break;
                default:
                    System.out.println("输入选项出错！");
            }
            if (isExit) break;
        }
    }

    private static void insert(Scanner scanner) {
        scanner.nextLine();
        System.out.print("请输入书籍的标题：");
        String title = scanner.nextLine();
        System.out.print("请输入书籍的作者：");
        String author = scanner.nextLine();
        System.out.print("请输入书籍的价格：");
        int price = scanner.nextInt();
        Book book = new Book(title, author, price);
        LIST.add(book);
        System.out.println("书籍添加成功：" + book);
    }

    private static void list() {
        for (int i = 0; i < LIST.size(); i++) {
            System.out.println(i + 1 + "." + LIST.get(i));
        }
    }

    private static void delete(Scanner scanner) {
        list();
        System.out.print("请输入要删除的书籍序号：");
        int i = scanner.nextInt();
        while (i > LIST.size() || i < 1) {
            System.out.print("输入序号出错，请重新输入：");
            i = scanner.nextInt();
        }
        LIST.remove(i - 1);
        System.out.println("删除成功！");
    }

    private static void modify(Scanner scanner) {
        list();
        System.out.print("请输入要修改的书籍序号：");
        int i = scanner.nextInt();
        while (i > LIST.size() || i < 1) {
            System.out.print("输入序号出错，请重新输入：");
            i = scanner.nextInt();
        }
        Book book = LIST.get(i-1);
        scanner.nextLine();
        System.out.print("请输入书籍的标题：");
        book.setTitle(scanner.nextLine());
        System.out.print("请输入书籍的作者：");
        book.setAuthor(scanner.nextLine());
        System.out.print("请输入书籍的价格：");
        book.setPrice(scanner.nextInt());
        System.out.println("修改成功！");
    }

    private static void save() throws IOException {
        System.out.println("正在保存图书数据...");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(LIST);
    }

    private static void load() throws IOException, ClassNotFoundException {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("正在加载图书数据...");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            LIST = (List<Book>) ois.readObject();
            return;
        }
        LIST = new LinkedList<>();
    }
}
