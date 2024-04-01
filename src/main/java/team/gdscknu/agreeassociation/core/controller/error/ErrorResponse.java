package team.gdscknu.agreeassociation.core.controller.error;

import lombok.Builder;

import java.util.List;

@Builder
public record ErrorResponse(
        String debugMessage,
        List<String> errors
) {
}
