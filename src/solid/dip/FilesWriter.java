package solid.dip;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilesWriter implements CommonWriter {
    private String filePath;

    public FilesWriter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}