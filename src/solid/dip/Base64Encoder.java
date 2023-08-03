package solid.dip;

import java.util.Base64;

public class Base64Encoder implements Encoder {
    @Override
    public String encode(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }
}