/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package springcrud.rafli.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author Muhamad Rafl Al Rasyid
 */

@Entity
@Table(name="buku")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value={"creatAt","updateAt"},allowGetters=true)
public class Buku {

@Id
int id_buku;

int id_kategori;
String judul_buku;
String deskripsi_buku;
int jumlah_buku;
String buku_cover;

    public int getId_buku() {
        return id_buku;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
    }

    public int getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getDeskripsi_buku() {
        return deskripsi_buku;
    }

    public void setDeskripsi_buku(String deskripsi_buku) {
        this.deskripsi_buku = deskripsi_buku;
    }

    public int getJumlah_buku() {
        return jumlah_buku;
    }

    public void setJumlah_buku(int jumlah_buku) {
        this.jumlah_buku = jumlah_buku;
    }

    public String getBuku_cover() {
        return buku_cover;
    }

    public void setBuku_cover(String buku_cover) {
        this.buku_cover = buku_cover;
    }
    
}
