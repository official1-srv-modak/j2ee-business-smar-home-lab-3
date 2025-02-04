package com.souravmodak.smarthome.models;


import java.util.List;

public class User {
    private Long id;
    private String username;
    private String email;
    private List<Device> devices;

    public User() {}

    public User(Long id, String username, String email, List<Device> devices) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.devices = devices;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<Device> getDevices() { return devices; }
    public void setDevices(List<Device> devices) { this.devices = devices; }
}

