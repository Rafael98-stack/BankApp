package Project.BankApp.dto.requests;

import Project.BankApp.Entities.Comune;

import java.time.LocalDate;

public record UpdateUtenteRequest(
        String nome,
        String cognome,
        String telefono,
        String indirizzo,
        LocalDate dataNascita,
        Comune comune
) {
}
