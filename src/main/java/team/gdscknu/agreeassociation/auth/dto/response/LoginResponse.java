package team.gdscknu.agreeassociation.auth.dto.response;

import team.gdscknu.agreeassociation.auth.dto.UserModel;

public record LoginResponse(
        String accessToken,
        String refreshToken,
        UserModel user
) {
}
