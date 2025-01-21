package Project.BankApp.dto.requests;

import Project.BankApp.Entities.Comune;

import java.time.LocalDate;

public record CreateUtenteRequest(
        String nome,
        String cognome,
        String email,
        String telefono,
        String codiceFiscale,
        String indirizzo,
        LocalDate dataNascita,
        Comune comune
) {
}
