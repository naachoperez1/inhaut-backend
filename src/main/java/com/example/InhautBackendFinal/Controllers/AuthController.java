package com.example.InhautBackendFinal.Controllers;

import com.example.InhautBackendFinal.Services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("api/auth")
//@CrossOrigin(origins = "*", methods = { GET, PUT, POST, DELETE})
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping
    public boolean login(@RequestParam String username,
                         @RequestParam String password){

        return authService.login(username, password);
    }
}
