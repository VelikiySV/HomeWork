package summerLectures.lessons7;

import java.io.File;
import java.io.IOException;

/**
 * Created by Volodymyr_Silitskyi on 7/19/2016.
 */
public class CreateFile {
    public static void main(String[] args) {
        File fileOne = new File("a.doc");
        try {
            fileOne.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
        }

        File fileTwo = new File("b.doc");

        fileOne.renameTo(fileTwo);

        fileTwo.delete();

        File folderOne = new File("FOLDER");
        folderOne.mkdir();

        File fileThree = new File(folderOne, "c.txt");
        try {
            fileThree.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
        }
        fileThree.delete();
        folderOne.delete();

        File mainFolder = new File(".");
        File[] fileArray = mainFolder.listFiles();
        for (File file : fileArray) {
            System.out.println(file);
        }
    }
}
