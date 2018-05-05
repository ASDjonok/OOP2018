package set;

import list.Brilliant;

public class Main {
    public static void main(String[] args) {
        MyBrilliantSet brilliantSet =
                new MyBrilliantSet();
        System.out.println(brilliantSet.size());
        System.out.println(
                brilliantSet.contains(
                    new Brilliant(10)));
        brilliantSet.add(
                new Brilliant(10));
        System.out.println(
                brilliantSet.contains(
                        new Brilliant(10)));
        System.out.println(brilliantSet.size());
    }
}
