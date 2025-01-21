package Project.BankApp.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty(message = "Il nome non può essere vuoto, impostare almeno un carattere")
    @NotBlank(message = "Il nome non può contenere spazi")
    private String nome;

    @NotEmpty(message = "Il cognome non può essere vuoto, impostare almeno un carattere")
    @NotBlank(message = "Il cognome non può contenere spazi")
    private String cognome;

    @NotEmpty(message = "La email non può essere vuoto, impostare almeno un carattere")
    @NotBlank(message = "La email non può contenere spazi")
    @Email(message = "Formato email non valido.")
    private String email;

    @NotEmpty(message = "Il numero di telefono è obbligatorio.")
    @Pattern(regexp = "^(\\+\\d{1,3}[- ]?)?\\d{10}$", message = "Formato numero di telefono non valido.")
    private String numero_telefono;

    @NotEmpty(message = "L'indirizzo non può essere vuoto, impostare almeno un carattere")
    @NotBlank(message = "L'indirizzo non può contenere spazi")
    private String indirizzo;

    @NotEmpty(message = "La data di nascita non può essere vuoto, impostare almeno un carattere")
    @NotBlank(message = "La data di nascita non può contenere spazi")
    @Past(message = "La data di nascita inserita non può essere impostata con una data avanzata da quella corrente")
    private LocalDate data_nascita;

    public User(String nome, String cognome, String email, String s, String indirizzo, LocalDate localDate) {
    }

}
