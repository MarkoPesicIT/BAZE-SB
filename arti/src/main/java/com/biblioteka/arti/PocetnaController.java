package com.biblioteka.arti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Clanovi")
public class PocetnaController {
    @Autowired
    private ClanoviRepo memberRepository;
    @PostMapping(name = "/add", consumes = "application/json")
    public ResponseEntity<String> addMember(@RequestBody Clanovi member) {
        // Save member to the database
        memberRepository.save(member);
        return ResponseEntity.ok("Member added and email sent successfully!");
    }
}