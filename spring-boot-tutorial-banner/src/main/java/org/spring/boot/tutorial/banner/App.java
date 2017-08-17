package org.spring.boot.tutorial.banner;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Banner实例
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication application = new SpringApplication(App.class);
    	application.setBannerMode(Banner.Mode.CONSOLE);
    	application.run(args);
    	
    }
}
