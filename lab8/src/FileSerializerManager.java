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

    public void saveAsTextSequence(MyBrilliantSet myBrilliantSet,
                                     String fileName) throws IOException {
        /*ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
        for (Brilliant brilliant : myBrilliantSet) {
            out.writeObject(brilliant);
        }
        out.close();*/
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(fileName)))) {
//        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(fileName)));
            for (Brilliant brilliant : myBrilliantSet) {
                bufferedWriter.write(brilliant.getCost() +
                        " " + brilliant.getWeight() + "\n");
            }
//            bufferedWriter.close();
        }
    }


    public MyBrilliantSet openAsTextSequence(String fileName) throws IOException, ClassNotFoundException {
        BufferedReader in = new BufferedReader(new FileReader(new File(fileName)));
        MyBrilliantSet myBrilliantSet = new MyBrilliantSet();
        String line = in.readLine();
        while (line != null) {
            String[] fieldValues = line.split(" ");
            Brilliant brilliant = new Brilliant(Integer.parseInt(fieldValues[0]),
                    Integer.parseInt(fieldValues[1]));
            myBrilliantSet.add(brilliant);
            line = in.readLine();
        }
        in.close();
        return myBrilliantSet;
    }


}
