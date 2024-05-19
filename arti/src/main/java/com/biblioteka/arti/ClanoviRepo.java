package com.biblioteka.arti;

import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ClanoviRepo extends JpaRepository<Clanovi, Long> {
    void save(Clanovi member);
}
