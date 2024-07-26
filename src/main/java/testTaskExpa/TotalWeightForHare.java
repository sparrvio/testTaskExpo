package testTaskExpa;

import java.util.List;

public class TotalWeightForHare {
    private List<Integer> list;
    private int totalWeight;

    public TotalWeightForHare(List<Integer> list, int totalWeight) {
        this.list = list;
        this.totalWeight = totalWeight;
    }

    public void maxCarrots() {
        int result = 0;
        int length = list.size();
        for (int i = 0; i < 10; ++i) {
            int weight = 0;
            for (int j = length; j > 0; j--) {
                if (weight + j > 5 || list.get(j - 1) == 0) {
                    continue;
                } else {
                    weight += j;
                    list.set(j - 1, list.get(j - 1) - j);
                    j++;
                }
            }
            if (weight > 0) {
                result += weight;
            }
        }
        System.out.println("\nОбщий вес моркови на всех полянках: " + totalWeight +  " кг,\n" +
                "из них за 10 ходок заяц сможет унести " + result + " кг.");
    }
}
