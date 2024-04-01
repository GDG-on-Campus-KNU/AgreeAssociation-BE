package team.gdscknu.agreeassociation.auth.dto;

import team.gdscknu.agreeassociation.auth.domain.Vendor;

public record UserModel(
        Long id,
        String email,
        String nickname,
        Integer point,
        String profileImageUrl
) {
}
