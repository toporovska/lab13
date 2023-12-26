package ua.edu.ucu.apps.twitterfacebook;

import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MessageSender {
    @Getter
    private final List<Client> receivers;

    public MessageSender() {
        this.receivers = new ArrayList<>();
    }

    public synchronized void addReceiver(Client user) {
        receivers.add(user);
    }

    public synchronized void removeReceiver(Client user) {
        receivers.remove(user);
    }

    public void send(String text, Client user, Country country) {
        if (isUserEligibleToSend(user, country)) {
            user.receiveMessage(text);
            System.out.println("Message sent to " + user.getEmail());
        } else {
            System.out.println("Message not sent to " + user.getEmail());
        }
    }

    public void sendAll(String text, Country country) {
        for (Client user : receivers) {
            send(text, user, country);
        }
    }

    private boolean isUserEligibleToSend(Client user, Country country) {
        return user.getCountry().equals(country.toString())
                && user.getLastActiveTime().isEqual(LocalDate.now());
    }
}
