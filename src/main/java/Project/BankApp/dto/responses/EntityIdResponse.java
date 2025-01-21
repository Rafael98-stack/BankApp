package Project.BankApp.dto.responses;

import lombok.Builder;

@Builder
public record EntityIdResponse (
        Long id
) {
}
