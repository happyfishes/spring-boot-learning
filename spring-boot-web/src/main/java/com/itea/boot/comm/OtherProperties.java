package com.itea.boot.comm;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName OtherProperties
 * @Describe
 * @create 2019-03-11 15:57
 * @Version 1.0
 **/
@Component
@ConfigurationProperties(prefix = "hhh")
public class OtherProperties {

    private String title;
    private String blog;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }
}
