package az.iktlab.javawebq5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Configuration
public class RedisConfig {

//    @Bean
    public void setup() throws IOException {
        // some configs

        File file = new File("java-web-q5-new/temp");

        if (!file.exists())
            file.createNewFile();
    }

//    @Bean
//    public LettuceConnectionFactory redisConnectionFactory() {
//
//        return new LettuceConnectionFactory(new RedisStandaloneConfiguration("server", 6379));
//    }
}
