package ua.edu.ucu.apps.twitterfacebook;

import java.time.LocalDate;

public interface Client {
    String getEmail();
    String getCountry();
    LocalDate getLastActiveTime();
    void receiveMessage(String text);
}
