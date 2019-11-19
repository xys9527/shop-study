package com.xys.shop.user;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan(basePackages = "com.xys.shop.user.mapper")
//配置通用mapper需要换成相应的 @MapperScan
@MapperScan(basePackages = "com.xys.shop.user.mapper")
public class ShopUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopUserApplication.class, args);
    }

}
