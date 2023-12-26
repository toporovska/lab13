package ua.edu.ucu.apps.TwitterFacebook;

import java.time.LocalDate;

public interface Client {
    String getEmail();
    String getCountry();
    LocalDate getLastActiveTime();
    void receiveMessage(String text);
}
