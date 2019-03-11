package com.itea.boot.comm;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName IteaProperties
 * @Describe
 * @create 2019-03-11 15:54
 * @Version 1.0
 **/
@Component
@ConfigurationProperties(prefix = "itea")
public class IteaProperties {

    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
