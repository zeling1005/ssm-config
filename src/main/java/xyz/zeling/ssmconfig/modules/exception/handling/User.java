package xyz.zeling.ssmconfig.modules.exception.handling;

import lombok.Data;

@Data
public class User {
    private String name;
    private String lastName;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public User() {}
}
