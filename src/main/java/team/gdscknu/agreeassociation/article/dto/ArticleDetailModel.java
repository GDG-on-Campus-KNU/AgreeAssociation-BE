package team.gdscknu.agreeassociation.article.dto;

import lombok.Builder;
import team.gdscknu.agreeassociation.article.domain.AgreeState;
import team.gdscknu.agreeassociation.article.domain.AgreeType;

import java.time.LocalDateTime;

@Builder
public record ArticleDetailModel(

        Long id,
        String title,
        LocalDateTime createdAt,
        Integer commentCount,
        Integer viewCount,
        Integer agreeCount,
        UserInfoModel author,


        Integer disagreeCount,
        AgreeType agreeType,



        String content,
        AgreeState agreeState
) {
}
