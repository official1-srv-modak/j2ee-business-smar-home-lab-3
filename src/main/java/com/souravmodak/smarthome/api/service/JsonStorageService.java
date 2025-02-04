package com.souravmodak.smarthome.api.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.souravmodak.smarthome.models.Device;
import org.springframework.stereotype.Service;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class JsonStorageService {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final File file = new File("devices.json");

    public void saveDevices(List<Device> devices) {
        try {
            objectMapper.writeValue(file, devices);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Device> loadDevices() {
        try {
            return objectMapper.readValue(file, objectMapper.getTypeFactory().constructCollectionType(List.class, Device.class));
        } catch (IOException e) {
            return List.of();
        }
    }
}
