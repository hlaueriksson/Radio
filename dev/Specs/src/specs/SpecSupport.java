package specs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class SpecSupport {

    public static File getFile(String path) throws IOException {

        String base = new java.io.File(".").getCanonicalPath();

        return new File(base + path);
    }

    public static String readFile(String path) throws IOException {

        return new Scanner(getFile(path), "UTF-8").useDelimiter("\\A").next();
    }

    public static InputStream getInputStream(String path) throws IOException {

        return new FileInputStream(SpecSupport.getFile(path));
    }
}
