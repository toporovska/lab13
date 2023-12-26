package ua.edu.ucu.apps.twitterfacebook;

import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TwitterClient implements Client {
    @Getter
    private final Twitter user;
    @Getter
    private final List<String> receivedMessages;

    public TwitterClient(Twitter user) {
        this.user = user;
        this.receivedMessages = new ArrayList<>();
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry().toString();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return LocalDate.parse(user.getLastActiveTime());
    }

    @Override
    public void receiveMessage(String text) {
        receivedMessages.add(text);
    }

    @Override
    public String toString() {
        return "TwitterClient{" 
            +
                "user=" 
            +
                 user 
            +
                ", receivedMessages=" 
            +
                 receivedMessages 
            +
                '}';
    }
}
