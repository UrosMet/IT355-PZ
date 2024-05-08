package com.metropolitan.it355.controller;

import com.metropolitan.it355.entity.Soba;
import com.metropolitan.it355.services.SobaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/soba")
public class SobaController {

    final SobaService sobaService;

    @GetMapping
    public ResponseEntity<List<Soba>> findAll() {
        return ResponseEntity.ok(sobaService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable int id) {
        if (sobaService.getById(id).isPresent()){
            return ResponseEntity.ok(sobaService.getById(id).get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("message", "Not found"));
    }

    @PostMapping
    public ResponseEntity<Soba> save(@RequestBody Soba Soba) {
        return ResponseEntity.ok(sobaService.add(Soba));
    }

    @PutMapping
    public ResponseEntity<Soba> update(@RequestBody Soba Soba) {
        return ResponseEntity.ok(sobaService.update(Soba));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        Optional<?> soba = sobaService.getById(id);

        if (soba.isPresent()) {
            sobaService.delete(id);
            return ResponseEntity.ok(soba);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("message", "Not found"));
    }

}
