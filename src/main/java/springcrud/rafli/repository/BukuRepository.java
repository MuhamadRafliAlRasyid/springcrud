/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package springcrud.rafli.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springcrud.rafli.model.Buku;

/**
 *
 * @author Muhamad Rafl Al Rasyid
 */
@Repository
public interface BukuRepository  extends JpaRepository<Buku,Integer>{
    
}
