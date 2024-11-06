package Cookease.com.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/cors")
public class corsController {

    @GetMapping("")
    public ResponseEntity<?> corsGet() {
        return ResponseEntity.ok("GET success");
    }

    @PostMapping("/{message}")
    public ResponseEntity<?> corsPost(@PathVariable("message") String message) {
        return ResponseEntity.ok(message);
    }
}
