package team.gdscknu.agreeassociation.auth.dto.response;

import lombok.Builder;

@Builder
public record TokenRefreshResponse(
        String accessToken
) {
}
