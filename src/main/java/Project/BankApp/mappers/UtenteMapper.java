package Project.BankApp.mappers;

import Project.BankApp.Entities.Utente;
import Project.BankApp.dto.requests.CreateUtenteRequest;
import org.springframework.stereotype.Service;

@Service
public class UtenteMapper {

    public Utente fromCreateUtenteRequest(CreateUtenteRequest request) {
        return Utente
                .builder()
                .nome(request.nome())
                .cognome(request.cognome())
                .email(request.email())
                .indirizzo(request.indirizzo())
                .codiceFiscale(request.codiceFiscale())
                .comune(request.comune())
                .dataNascita(request.dataNascita())
                .telefono(request.telefono())
                .build();
    }

}
