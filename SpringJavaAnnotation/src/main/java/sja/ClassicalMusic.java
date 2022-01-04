package sja;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Vasiliy Ryzhkovskiy
 */


public class ClassicalMusic implements Music {

    @PostConstruct
    public void init() {
        System.out.println("[ClassicalMusic] initialization...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("[ClassicalMusic] destroing...");
    }

    @Override
    public String getSong() {
        return "Chaikovskiy - Shelkunckik";
    }
}
