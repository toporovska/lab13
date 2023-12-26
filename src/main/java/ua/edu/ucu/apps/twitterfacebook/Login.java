package ua.edu.ucu.apps.twitterfacebook;

import java.time.LocalDate;

public class Login {
    public static Client login(String loginMethod) {
        if ("twitter".equals(loginMethod)) {
            return new TwitterClient(
                    new Twitter("@gmail.com", "Ukraine", "2023-11-21")
            );
        }
        if ("facebook".equals(loginMethod)) {
            return new FacebookClient(
                    new Facebook("@gmail.com", Country.Ukraine, LocalDate.now())
            );
        }
        throw new IllegalArgumentException("Invalid login method");
    }
}
