package com.souravmodak.smarthome.models;

public class Device {
    private Long id;
    private String name;
    private String type;
    private boolean status; // true = ON, false = OFF

    public Device(Long id, String name, String type, boolean status) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public boolean isStatus() { return status; }
    public void setStatus(boolean status) { this.status = status; }
}
