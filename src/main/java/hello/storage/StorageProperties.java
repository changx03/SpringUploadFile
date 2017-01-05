package hello.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Luke Chang on 05-Jan-17.
 */
@ConfigurationProperties("storage")
public class StorageProperties{

    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
