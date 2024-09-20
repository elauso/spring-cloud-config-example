package net.elau.example.client.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/toggle")
public class ToggleController {

    @Value("${client.toggle.enabled}")
    private boolean enabled;

    @GetMapping("/enabled")
    public String getEnabled() {
        return Boolean.valueOf(enabled).toString();
    }
}
