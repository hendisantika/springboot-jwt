package com.hendisantika.springbootjwt.model;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jwt
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-11
 * Time: 05:11
 */
public class UserDTO {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
