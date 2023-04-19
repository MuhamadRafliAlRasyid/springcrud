package springcrud.rafli.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springcrud.rafli.ErrorHandler.NotFound;
import springcrud.rafli.model.Buku;
import springcrud.rafli.repository.BukuRepository;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    BukuRepository bukuRepository;

    //getall
    @GetMapping("/buku")
    public List<Buku> getAll(){
        return bukuRepository.findAll();
    }
    @PostMapping("/buku")
    public Buku insertBuku(@Validated @RequestBody Buku buku){
        return bukuRepository.save(buku);
    }

    @GetMapping("/buku/{id_buku}")
    public Buku getBuku(@PathVariable(value="id_buku")int id_buku){
        return bukuRepository.findById(id_buku).orElseThrow(()->new NotFound("Buku","id_buku",id_buku));
    }
    @PutMapping("/buku/{id_buku}")
    public Buku updateBuku(@PathVariable(value="id_buku")int id_buku,@Validated @RequestBody Buku bukuDetail){
        Buku buku =bukuRepository.findById(id_buku).orElseThrow(()->new NotFound("Buku","id_buku",id_buku));
        buku.setJudul_buku("Pemrograman Spring Boot Rafli");
        buku.setDeskripsi_buku("Muhamad Rafli Al Rasyid");
        Buku updateBuku = bukuRepository.save(buku);
        return updateBuku;
    }

    @DeleteMapping("/buku/{id_buku}")
    public ResponseEntity<?> deleteBuku(@PathVariable(value="id_buku")int id_buku){
        Buku buku =bukuRepository.findById(id_buku).orElseThrow(()->new NotFound("Buku","id_buku",id_buku));
        bukuRepository.delete(buku);
        return ResponseEntity.ok().build();
    }
}
