package summerLectures.lessons7;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

/**
 * Created by Volodymyr_Silitskyi on 7/19/2016.
 */
public class FillFile {
    public static void main(String[] args) {
        saveFolderInfoToFile("D:/Work/All/CHECK LIST", "report.doc");
    }

    private static String getFileInfo(File file) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
        String result = String.format("%-20.20s\t%-6.6s\t%-12.12s\t%-10.10s", file.getName(), file.isFile() ? "File" : "Folder", "" + file.length(), sdf.format(file.lastModified()));
        return result;
    }

    static void saveFolderInfoToFile(String folderAdress, String fileAdress) {
        File folder = new File(folderAdress);
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Folder do not exist");
            return;
        }
        StringBuilder sb = new StringBuilder();

        String result = String.format("%-20.20s\t%-6.6s\t%-12.12s\t%-10.10s", "Name", "Type", "Size", "Date");
        sb.append(result);
        sb.append(System.lineSeparator());
        sb.append(System.lineSeparator());
        File[] fileArray = folder.listFiles();

        for (File file : fileArray) {
            sb.append(getFileInfo(file));
            sb.append(System.lineSeparator());
        }
        try (PrintWriter pw = new PrintWriter(fileAdress)) {
            pw.println(sb.toString());
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Done!");
    }
}
