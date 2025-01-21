package Project.BankApp.Repositories;

import Project.BankApp.Entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UtenteRepository extends JpaRepository<Utente,Integer> {
    List<Utente> findByEmail(String email);
}
