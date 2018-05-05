package list;

public class Main {
    public static void main(String[] args) {
        /*Collection arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("123");

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Object o : arrayList) {
            System.out.println(o);
        }*/

        MyBrilliantList myBrilliantList =
                new MyBrilliantList();
        myBrilliantList.add(new Brilliant(10));
        myBrilliantList.add(new Brilliant(30));
        for (Brilliant brilliant : myBrilliantList) {
            System.out.println(brilliant);
        }
    }
}
