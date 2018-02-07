package vemex.spring.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 系统启动类
 *
 * SpringBootApplication标记springboot的程序类 等同于标记了@Configuration, @EnableAutoConfiguration and @ 。
 * @author wangweiwei
 * @date 2018-01-20
 */
@SpringBootApplication
public class QuickstartApplication {
	/**
	 * 启动入口
	 * @param args  启动参数
	 */
	public static void main(String[] args) {
		//运行Spring boot application
		SpringApplication.run(QuickstartApplication.class, args);
	}
}
