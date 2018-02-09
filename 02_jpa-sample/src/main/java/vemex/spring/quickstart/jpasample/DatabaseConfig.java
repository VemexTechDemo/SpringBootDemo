package vemex.spring.quickstart.jpasample;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangweiwei
 */
@Component
@ConfigurationProperties(prefix = "spring")
public class DatabaseConfig {

    private Map<String, String> datasource = new HashMap<>();
    public DatabaseConfig() {
    }

    public String getDriverClassName() {        return this.datasource.get("driver-class-name");

    }


    public String getUrl() {        return this.datasource.get("url");

    }



    public String getUsername() {   return this.datasource.get("username");

    }



    public String getPassword() {
        return this.datasource.get("password");
    }



    public Map<String, String> getDatasource() {
        return datasource;
    }

    public void setDatasource(Map<String, String> datasource) {
        this.datasource = datasource;
    }
}
