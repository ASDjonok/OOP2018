import java.io.*;

public class FileSerializerManager {
    public void saveAsSingleObject(MyBrilliantSet myBrilliantSet,
                                   String fileName) throws IOException {
        File file = new File(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                fileOutputStream
        );

        objectOutputStream.writeObject(myBrilliantSet);

        objectOutputStream.close();

        /*ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("save2.obj")));
        out.writeObject(myBrilliantSet);
        out.close();*/
    }

    public MyBrilliantSet openAsSingleObject(String fileName) throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        FileInputStream fileInputStream = new FileInputStream(
                file
        );
        ObjectInputStream objectInputStream =
                new ObjectInputStream(
                        fileInputStream
                );
        MyBrilliantSet myBrilliantSet = (MyBrilliantSet) objectInputStream.readObject();
        objectInputStream.close();
        return myBrilliantSet;
        /*ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("save2.obj")));
        MyBrilliantSet myBrilliantSet = (MyBrilliantSet) in.readObject();
        in.close();
        return myBrilliantSet;*/
    }

    public void saveAsObjectSequence(MyBrilliantSet myBrilliantSet,
                                     String fileName) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
        for (Brilliant brilliant : myBrilliantSet) {
            out.writeObject(brilliant);
        }
        out.close();
    }


    public MyBrilliantSet openAsObjectSequence(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File(fileName)));
        MyBrilliantSet myBrilliantSet = new MyBrilliantSet();
        try {
            Brilliant brilliant = (Brilliant) in.readObject();
            while (true) {
                myBrilliantSet.add(brilliant);
                brilliant = (Brilliant) in.readObject();
            }
        } catch (EOFException e) {
            in.close();
        }
        return myBrilliantSet;
    }
}
