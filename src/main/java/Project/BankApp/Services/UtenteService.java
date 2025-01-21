package Project.BankApp.Services;

import Project.BankApp.Entities.Utente;
import Project.BankApp.Repositories.UtenteRepository;
import Project.BankApp.dto.requests.CreateUtenteRequest;
import Project.BankApp.dto.requests.UpdateUtenteRequest;
import Project.BankApp.dto.responses.EntityIdResponse;
import Project.BankApp.exceptions.UtenteNotFoundException;
import Project.BankApp.mappers.UtenteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtenteService {

    @Autowired
    private UtenteRepository utenteRepository;
    @Autowired
    private UtenteMapper utenteMapper;

    public Utente getById(Long id) throws UtenteNotFoundException {
        return utenteRepository
                .findById(id.intValue())
                .orElseThrow(() -> new UtenteNotFoundException("utente con id " + id + " non trovato"));
    }

    public List<Utente> getAll() {
        return utenteRepository.findAll();
    }

    public EntityIdResponse createUtente(CreateUtenteRequest request) {
        Utente utenteSaved = utenteRepository.save(utenteMapper.fromCreateUtenteRequest(request));
        return new EntityIdResponse(utenteSaved.getId());
    }

    public EntityIdResponse updateUtente(Long id, UpdateUtenteRequest request) throws UtenteNotFoundException {
        Utente myUtente = getById(id);
        myUtente.setNome(request.nome());
        myUtente.setCognome(request.cognome());
        myUtente.setIndirizzo(request.indirizzo());
        myUtente.setDataNascita(request.dataNascita());
        myUtente.setComune(request.comune());
        return new EntityIdResponse(utenteRepository.save(myUtente).getId());
    }

    public void deleteById(Long id) {
        utenteRepository.deleteById(id.intValue());
    }

}

