package team.gdscknu.agreeassociation.auth.dto.request;

import team.gdscknu.agreeassociation.auth.domain.Vendor;

public record LoginSocialRequest(
        String accessToken,
        Vendor vendor
) {
}
