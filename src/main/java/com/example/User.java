package com.example;

/**
 * @author khatami ( khatami@caspco.ir)
 * @version 1.0 2024.0605
 * @createDate 7/7/2025
 * @since 1.0
 */
public class User {
    private String name;
    private boolean active;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
