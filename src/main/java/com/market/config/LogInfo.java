package com.market.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "log")
public class LogInfo {
    @Value("${log.path}")
    private String path;

    @Value("${log.rotate}")
    private String rotate;

    @Value("${log.interval}")
    private Integer interval;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRotate() {
        return rotate;
    }

    public void setRotate(String rotate) {
        this.rotate = rotate;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    @Override
    public String toString() {
        return "LogInfo{" +
                "path='" + path + '\'' +
                ", rotate='" + rotate + '\'' +
                ", interval=" + interval +
                '}';
    }
}
