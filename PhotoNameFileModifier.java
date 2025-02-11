import java.io.BufferedReader; //import BufferedReader class to read text from a file line by line efficiently.
import java.io.FileReader; // import FileReader class to read the contents of a file.
import java.io.IOException; // import IOException to handle any errors that occur while reading the file.

public class PhotoFileNameModifier { // define a public class named PhotoFileNamedModifier. Every java program needs a class.
    public static void main(String[] args) { // this is the main method where the program starts executing.
        // Define the file name
        // Defines a file name as a String. This file will contain the photo file names we want to modify.
        String fileName = "ParkPhotos.txt";
        // String fileName = "ParkPhotos.txt";
        // Try reading the file and modifying the file names
        // We will attempt to read the file and modify its contents, but file operations can cause errors,
        // so we can use a try-catch block to handle potential issues.
        try {
            // Create the BufferedReader to read the file
            // Create a BufferedReader object to read the file line by line
            // It wraps around a FileReader, which reads the actual file.
            BufferedReader reader = new BufferedReader(new FileReader(fileName));            // BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String photoFileName = null; //Declare a String variable that will hold on each line ( photo file name) as we read the file.
            // String photoFileName; // Declare a String variable that will hold on each line ( photo file name) as we read the file.
            // Read each line from the file
            // Loop through the file, reading one line at a time.
            // The readLine() method reads a line of text. If it returns null, it means we've reached the end of the file.
            while ((modified = reader.readLine()) != null) {
                // Replace "_photo.jpg" with "_info.txt" in the current file name (if it exists)
               // This creates a modified file names
                String modifiedFiledName = modifiedFileName.replace("_photo.jpg", "_info.txt");

                // Print the modified file name to the console
                System.out.println(photoFileName);
            }

            // Close the reader
            // Close the BufferedReader to release system resources after we are done reading the file.
            reader.close();

        } catch (IOException e) { // Catch block to handle any IOExceptions that might occur ( like if the file is missing or unreadable).
            // If there;s an error, print an error message along with the actual error description.
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}



