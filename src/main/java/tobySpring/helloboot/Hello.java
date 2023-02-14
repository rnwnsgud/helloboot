package tobySpring.helloboot;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class Hello {
    private String name;
    private int count;

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public Hello(String name, int count) {
        this.name = name;
        this.count = count;
    }

//    WebMvcConfigurer
//    WebMvcConfigurerAdapter
}
