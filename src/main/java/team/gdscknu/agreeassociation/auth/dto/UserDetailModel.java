package team.gdscknu.agreeassociation.auth.dto;

import team.gdscknu.agreeassociation.auth.domain.Vendor;

public record UserDetailModel(
        Long id,
        String email,
        String nickname,
        String profileImageUrl,
        Double level,
        Integer point,
        Vendor vendor,
        String vendorEmail
) {
}
