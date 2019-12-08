package core.classloader;

import org.apache.commons.compress.utils.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String myPath = "/Users/juntao/DeskTop/";
        System.out.println(myPath);
        try {
            InputStream is = new FileInputStream(myPath +  name.replace(".", "/") + ".class");
            byte[] bytes = IOUtils.toByteArray(is);
            return defineClass(name, bytes, 0, bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.loadClass(name);
    }
}
