package ua.edu.ucu.apps.TwitterFacebook;

import java.time.LocalDate;

public class Login {
    public static Client login(String loginMethod) {
        if (loginMethod.equals("twitter")) {
            return new TwitterClient(new Twitter("@gmail.com", "Ukraine", "2023-11-21"));
        } else if (loginMethod.equals("facebook")) {
            return new FacebookClient(new Facebook("@gmail.com", Country.Ukraine, LocalDate.now()));
        }
        throw new IllegalArgumentException("No corect login Method");
    }
}
