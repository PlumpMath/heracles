package heracles;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by txangel on 5/14/14.
 */
public class Iolaus extends ClassLoader {
    @Override
    public Class<?> loadClass(String class_name) throws ClassNotFoundException {
        if(class_name.contains(".Siamese")) {
            try {
                InputStream is = getResourceAsStream(class_name.replaceAll("\\.", "/") + ".class");
                byte[] class_object = IOUtils.toByteArray(is);

                return defineClass(class_name, class_object, 0, class_object.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return super.loadClass(class_name, true);
    }
}
