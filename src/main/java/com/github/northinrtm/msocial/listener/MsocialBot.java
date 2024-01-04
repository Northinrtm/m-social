package com.github.northinrtm.msocial.listener;

import com.github.northinrtm.msocial.entity.User;
import com.github.northinrtm.msocial.service.MessageService;
import com.github.northinrtm.msocial.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.generics.LongPollingBot;

import java.util.Optional;

@Component
public class MsocialBot extends DefaultAbsSender implements LongPollingBot {

    private final UserService userService;
    private final MessageService messageService;

    @Value("${telegram.bot.name}")
    String botName;

    public MsocialBot(@Value("${telegram.bot.token}") String botToken,
                      UserService userService,
                      MessageService messageService) {
        super(new DefaultBotOptions(), botToken);
        this.userService = userService;
        this.messageService = messageService;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            long userChatId = update.getMessage().getFrom().getId();
            Optional<User> userOptional = userService.findByChatId(userChatId);
            if (userOptional.isEmpty()) {
                userService.createUser(userChatId);
            } else {
                userService.updateMessageDate(userOptional.get());
            }
        }
    }


    @Override
    public void clearWebhook() throws TelegramApiRequestException {

    }

    @Override
    public String getBotUsername() {
        return botName;
    }
}