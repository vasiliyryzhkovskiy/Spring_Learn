package sja;

// import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

/**
 * Класс конфигурации Spring контекста
 */

@Configuration
//@ComponentScan("sja") // директория где лежат bean
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    @Scope(value = "prototype")
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    MusicPlayer musicPlayer() {
        return new MusicPlayer(classicalMusic(), rockMusic());
    }
}
