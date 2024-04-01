package team.gdscknu.agreeassociation.core.dto.request;

import jakarta.validation.constraints.Min;

public record PagingQuery(
        @Min(0)
        Integer page,
        Integer size
) {
        public PagingQuery {
                if (size == null) {
                        size = 10;
                }
        }
}
