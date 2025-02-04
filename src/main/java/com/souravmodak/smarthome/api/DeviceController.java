package com.souravmodak.smarthome.api;

import com.souravmodak.smarthome.api.service.DeviceService;
import com.souravmodak.smarthome.models.Device;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DeviceController {
    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/devices")
    public String getDevices(Model model) {
        List<Device> devices = deviceService.getAllDevices();
        model.addAttribute("devices", devices);
        return "devices";
    }

    @PostMapping("/toggle-device")
    public String toggleDevice(@RequestParam Long id) {
        deviceService.toggleDevice(id);
        return "redirect:/devices";
    }
}
