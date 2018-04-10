package com.sc.book.config.vault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zzf
 * @date: 2018/2/5
 * @time: 19:36
 * @description :  配置的启动类
 */
@SpringBootApplication
@EnableConfigServer
public class VaultConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VaultConfigServerApplication.class, args);

    }
}
