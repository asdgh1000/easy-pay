import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import static org.springframework.boot.SpringApplication.run;

@ComponentScan(basePackages ="com.easyPay")
@SpringBootApplication
public class App{
    public static void main(String[] args) {
        ConfigurableApplicationContext run = run(App.class, args);
    }

}
