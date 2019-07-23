package org.springframework.boot.autoconfigure.klock.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Created by kl on 2017/12/31.
 */
@SpringBootApplication
@EnableCaching
public class KlockTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(KlockTestApplication.class, args);
    }

}
