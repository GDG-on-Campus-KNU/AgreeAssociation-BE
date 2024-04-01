package team.gdscknu.agreeassociation.article.dto;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ArticleCommentChildModel(
        Long id,
        String content,
        LocalDateTime createdAt,
        UserInfoModel author
) {
}
