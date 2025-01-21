package Project.BankApp.Dtos.UserDtos;

import java.time.LocalDate;

public record UserRegisterDto(
        String nome,
        String cognome,
        String email,
        String numero_telefono,
        String indirizzo,
        LocalDate data_nascita
) {
}
