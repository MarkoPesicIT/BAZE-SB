package com.biblioteka.arti;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
public class Clanovi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    @Setter
    private String ime;
    @Getter
    @Setter
    private String prezime;
    @Getter
    @Setter
    private String brojTelefona;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String datumRodjenja;
    @Getter
    @Setter
    private String adresaStanovanja;
    @Getter
    @Setter
    private String clanarina;
    @Getter
    @Setter
    private int pozivnabroj;
    @Override
    public String toString()
    {
        return String.format(
                "Customer[id=%d, ime='%s', prezime='%s', brojTelefona='%s', email='%s', datumRodjenja='%s', adresaStanovanja='%s', clanarina='%s', pozivnabroj='%d']",
                id, ime, prezime, brojTelefona, email, datumRodjenja, adresaStanovanja, clanarina, pozivnabroj);
    }
}
