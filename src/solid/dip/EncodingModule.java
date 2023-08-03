package solid.dip;

public class EncodingModule {

    public EncodingModule() {
    }

    public static void encodeAndWrite(CommonReader reader, Encoder encoder, CommonWriter writer) {
        String data = String.valueOf(reader.read());
        String encodedData = encoder.encode(data);
        writer.write(encodedData);
    }

}

