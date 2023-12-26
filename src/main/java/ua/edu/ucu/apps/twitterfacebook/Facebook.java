package ua.edu.ucu.apps.twitterfacebook;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;


@Getter
@AllArgsConstructor
public class Facebook {
    private String email;
    private Country userCountry;
    private LocalDate getUserActiveTime;
}
