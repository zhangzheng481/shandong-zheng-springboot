package shandong.zheng.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangzheng481@163.com
 * @since 2025/3/8 16:17
 */
@SpringBootApplication
@MapperScan("shandong.zheng.springboot.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
