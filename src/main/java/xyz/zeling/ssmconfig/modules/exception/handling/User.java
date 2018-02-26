package xyz.zeling.ssmconfig.modules.exception.handling;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -248100335615583613L;
    private String name;
    private String lastName;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public User() {}
}
