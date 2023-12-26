package ua.edu.ucu.apps.twitterfacebook;

import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FacebookClient implements Client {
    @Getter
    private final Facebook user;
    @Getter
    private final List<String> receivedMessages;

    public FacebookClient(Facebook user) {
        this.user = user;
        this.receivedMessages = new ArrayList<>();
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getUserCountry().toString();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return user.getGetUserActiveTime();
    }

    @Override
    public void receiveMessage(String text) {
        receivedMessages.add(text);
    }


    @Override
    public String toString() {
        return "FacebookClient{" +
                "user=" + user +
                ", receivedMessages=" + receivedMessages +
                '}';
    }
}
