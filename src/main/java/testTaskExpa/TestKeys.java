package testTaskExpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
        Для решения этой задачи подойдет т.н. жадный алгоритм.
        Каждый раз мы будем принимать локально лучшее решение с расчетом на то,
        что в итоге это даст нам лучшее решение на глобальном уровне.
*/

public class TestKeys {
    public static void main(String[] args) {
        System.out.println("Введите количество морковок на полянках в штуках начиная с полянки № 1");
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int totalWeight = 0;
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextInt()) {
                list.add(scanner.nextInt() * (i + 1));
                totalWeight += list.get(i);
                System.out.println("На полянке № " + (i + 1) + ": " + list.get(i) + " килограмм моркови");
            } else {
                i--;
                System.out.println("Некорректный ввод");
                scanner.next();
            }
        }

        TotalWeightForHare weight = new TotalWeightForHare(list, totalWeight);
        weight.maxCarrots();
    }
}
