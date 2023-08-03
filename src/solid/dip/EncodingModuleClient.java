package solid.dip;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "C:/Users/bhavesh.mh/Downloads/Solid all five/Solid all five/src/solid/dip/beforeEncryption.txt";
        String outputFilePath = "C:/Users/bhavesh.mh/Downloads/Solid all five/Solid all five/src/solid/live/dip/afterEncryption.txt";
        EncodingModule.encodeAndWrite(new FilesReader(inputFilePath), new Base64Encoder(), new FilesWriter(outputFilePath));

        String urlString = "http://myfirstappwith.appspot.com/index.html";
        EncodingModule.encodeAndWrite(new NetworkReader(urlString), new Base64Encoder(), new DatabaseWriter());

    }
}
