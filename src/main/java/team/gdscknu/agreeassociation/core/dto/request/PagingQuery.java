package team.gdscknu.agreeassociation.core.dto.request;

import jakarta.validation.constraints.Min;

public record PagingQuery(
        @Min(0)
        Integer page,
        @Min(1)
        Integer size
) {
}
