package cn.qst.sale;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.qst.sale.dao")
public class SalemanagementApplication{

    public static void main(String[] args) {
        SpringApplication.run(SalemanagementApplication.class, args);
    }

}
