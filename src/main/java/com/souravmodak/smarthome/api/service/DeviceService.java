package com.souravmodak.smarthome.api.service;

import com.souravmodak.smarthome.models.Device;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceService {
    private List<Device> devices = new ArrayList<>();

    public DeviceService() {
        // Add some dummy devices
        devices.add(new Device(1L, "Living Room Light", "Light", true));
        devices.add(new Device(2L, "Bedroom Thermostat", "Thermostat", false));
        devices.add(new Device(3L, "Kitchen Fan", "Fan", true));
        devices.add(new Device(4L, "Garage Door", "Door", false));
    }

    public List<Device> getAllDevices() {
        return devices;
    }

    public void toggleDevice(Long id) {
        for (Device device : devices) {
            if (device.getId().equals(id)) {
                device.setStatus(!device.isStatus());
                break;
            }
        }
    }
}
