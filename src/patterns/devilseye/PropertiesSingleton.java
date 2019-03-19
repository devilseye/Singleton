package patterns.devilseye;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesSingleton {
    private static volatile PropertiesSingleton instance;

    private Properties properties;

    private PropertiesSingleton() { }

    public static PropertiesSingleton getInstance() {
        synchronized (PropertiesSingleton.class) {
            if (instance == null) {
                instance = new PropertiesSingleton();
                instance.properties = new Properties();
                try {
                    FileInputStream fis = new FileInputStream(
                            new File("config.properties"));
                    instance.properties.load(fis);
                } catch (Exception e) {
                    System.out.println("Error: Reading properties failed!");
                }
            }
        }
        return instance;
    }

    public String getProperty(String key) {
        String value = null;
        if (properties.containsKey(key))
            value = (String) properties.get(key);
        else {
            System.out.println("Error: Property is not found!");
        }
        return value;
    }
}
