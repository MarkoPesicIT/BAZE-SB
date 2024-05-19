package com.biblioteka.arti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Clanovi")
public class PocetnaController {
    private final ClanoviRepo memberRepository;

    public PocetnaController(ClanoviRepo memberRepository) {
        this.memberRepository = memberRepository;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addMember(@RequestBody Clanovi member) {
        // Save member to the database
        memberRepository.save(member);
        return ResponseEntity.ok("Member added and email sent successfully!");
    }
}