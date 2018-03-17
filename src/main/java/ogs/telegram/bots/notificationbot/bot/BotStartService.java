package ogs.telegram.bots.notificationbot.bot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import javax.annotation.PostConstruct;

@Service
public class BotStartService {

    private final TelegramBotsApi telegramBotsApi;
    private final Martian martian;

    @Autowired
    public BotStartService(TelegramBotsApi telegramBotsApi, Martian martian) {
        this.telegramBotsApi = telegramBotsApi;
        this.martian = martian;
    }

    @PostConstruct
    private void inti() {
        try {
            telegramBotsApi.registerBot(martian);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
