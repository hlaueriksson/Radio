package specs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SpecSupport {

    public static File getFile(String path) throws IOException {

        String base = new java.io.File(".").getCanonicalPath();

        return new File(base + path);
    }

    public static InputStream getInputStream(String path) throws IOException {

        return new FileInputStream(SpecSupport.getFile(path));
    }
}
