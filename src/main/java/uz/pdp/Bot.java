package uz.pdp;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class Bot extends TelegramLongPollingBot {
    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        if (update.getMessage().getText().equals("/start")) {
            SendMessage sendMessage = new SendMessage(update.getMessage().getChatId(), "qalesan");
            execute(sendMessage);
        }else {
            SendMessage sendMessage = new SendMessage(update.getMessage().getChatId(), "noto'g'ri");
            execute(sendMessage);
        }
        ;
    }

    @Override
    public String getBotUsername() {
        return "sardor753_bot";
    }

    @Override
    public String getBotToken() {
        return "1039859286:AAG7UMaUfiOeJ2v7VoNKAu0c0zNnzZCLPNk";
    }
}
