package designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Directory dir1 = new Directory("DirOne", new ArrayList<File>(), new ArrayList<>());

        List dir2files = new ArrayList<File>();
        dir2files.add(new File("File Two", 0));
        dir2files.add(new File("File Three", 0));

        Directory dir2 = new Directory("DirTwo", dir2files, new ArrayList<>());

        dir1.add(new File("FileOne", 0));
        dir1.add(dir2);

        dir1.open();

    }

}
