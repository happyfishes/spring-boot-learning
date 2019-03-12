package com.itea.boot;

import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FileUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileUploadApplication.class, args);
    }

    @Bean
    public TomcatServletWebServerFactory tomcatEmbedded() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addConnectorCustomizers(connector -> {
            if (connector.getProtocolHandler() instanceof AbstractHttp11Protocol<?>) {
                ((AbstractHttp11Protocol) connector.getProtocolHandler()).setMaxSwallowSize(-1);
            }
        });
        return tomcat;
    }
}
