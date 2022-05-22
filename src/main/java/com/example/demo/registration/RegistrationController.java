package com.example.demo.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping
    public String register(@RequestBody RegistrationRequest request) {
        String x = registrationService.register(request);
        System.out.println("stop");
        return x;
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token")String token) {
        return registrationService.confirmToken(token);
    }
}
