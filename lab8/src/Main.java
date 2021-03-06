import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileSerializerManager fileSerializerManager =
                new FileSerializerManager();
        MyBrilliantSet myBrilliantSet =
                new MyBrilliantSet();
        myBrilliantSet.add(new Brilliant(1, 2));
        myBrilliantSet.add(new Brilliant(2, 3));
        myBrilliantSet.add(new Brilliant(4, 56));
        fileSerializerManager.saveAsSingleObject(
                myBrilliantSet, "1.obj"
        );
        MyBrilliantSet myOpenedBrilliantSet = fileSerializerManager.openAsSingleObject("1.obj");
        for (Brilliant brilliant : myOpenedBrilliantSet) {
            System.out.println(brilliant);
        }

        fileSerializerManager.saveAsObjectSequence(myBrilliantSet, "2.obj");
        myOpenedBrilliantSet = fileSerializerManager.openAsObjectSequence("2.obj");
        for (Brilliant brilliant : myOpenedBrilliantSet) {
            System.out.println(brilliant);
        }

        fileSerializerManager.saveAsTextSequence(myBrilliantSet, "3.txt");
        myOpenedBrilliantSet = fileSerializerManager.openAsTextSequence("3.txt");
        for (Brilliant brilliant : myOpenedBrilliantSet) {
            System.out.println(brilliant);
        }
    }
}
