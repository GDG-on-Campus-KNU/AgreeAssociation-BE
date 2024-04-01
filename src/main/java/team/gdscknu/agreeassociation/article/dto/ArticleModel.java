package team.gdscknu.agreeassociation.article.dto;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ArticleModel(
        Long id,
        String title,
        LocalDateTime createdAt,
        Integer commentCount,
        Integer viewCount,
        Integer agreeCount,
        UserInfoModel author
) {
}
