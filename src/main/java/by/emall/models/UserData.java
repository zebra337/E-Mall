package by.emall.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserData {

    String firstName;
    String lastName;
    String patronymicName;
    String phoneNumber;
    String eMail;
    String password;
    String rePassword;
    String awaitCodeTitle;
}