package com.labs.logger.entities;

public class WriteImpl implements Write {
    private String profile;

    public WriteImpl(String profile) {
        this.profile = profile;
    }

    public String getProfile() {
        return profile;
    }

    public void writeLog(String log) {
        System.out.println("Profile: " + profile + " -> "+ log);

    }
}