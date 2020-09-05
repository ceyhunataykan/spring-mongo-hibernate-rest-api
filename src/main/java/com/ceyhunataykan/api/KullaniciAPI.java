package com.ceyhunataykan.api;

import com.ceyhunataykan.entity.Kullanici;
import com.ceyhunataykan.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/kullanicilar")
public class KullaniciAPI {
    @Autowired
    private KullaniciRepository kullaniciRepository;

    @GetMapping
    public List<Kullanici> tumListele(){
        return kullaniciRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Kullanici idListele(@PathVariable String id) throws KullaniciNotFoundException {

        Optional<Kullanici> kullaniciOptional = kullaniciRepository.findById(id);

        return kullaniciOptional.orElseThrow(() -> new KullaniciNotFoundException(id));
    }

    @PostMapping
    public ResponseEntity<Kullanici> ekle(@RequestBody Kullanici kullanici){
        return ResponseEntity.ok(kullaniciRepository.save(kullanici));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> guncelle(@RequestBody Kullanici kullanici, @PathVariable String id) {

        Optional<Kullanici> kullaniciOptional = kullaniciRepository.findById(id);

        if (!kullaniciOptional.isPresent())
            return ResponseEntity.notFound().build();

        kullanici.setId(id);

        kullaniciRepository.save(kullanici);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public void sil(@PathVariable String id) {
        kullaniciRepository.deleteById(id);
    }

}
