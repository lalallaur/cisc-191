import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PhotoFilenameProcessor {
    public static void main(String[] args) {
        String fileName = "ParkPhotos.txt";

        try {
            File photoFile = new File(fileName);
            Scanner fileScanner = new Scanner(photoFile);

            while(fileScanner.hasNextLine()) {
                String photoName = fileScanner.nextLine();
                String infoName = photoName.replace("_photo.jpg", "_info.txt");

                System.out.println(infoName);

            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File " + fileName + " not found.");
        }
    }
}
