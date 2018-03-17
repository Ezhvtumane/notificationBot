package ogs.telegram.bots.notificationbot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;

@SpringBootApplication
public class NotificationBotApp {

    public static void main(String[] args) {

        ApiContextInitializer.init();

        ApplicationContext ctx = SpringApplication.run(NotificationBotApp.class);
        for (String bean : ctx.getBeanDefinitionNames()) {
            System.out.println(bean);
        }
    }

    @Bean
    public TelegramBotsApi telegramBotsApi() {
        return new TelegramBotsApi();
    }
}
