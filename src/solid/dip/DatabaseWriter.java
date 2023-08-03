package solid.dip;

public class DatabaseWriter implements CommonWriter {
    @Override
    public void write(String data) {
        MyDatabase database = new MyDatabase();
        database.write(data);
    }
}