package team.gdscknu.agreeassociation.article.dto.request;

import jakarta.validation.constraints.Min;
import team.gdscknu.agreeassociation.article.domain.ArticleSort;

public record ArticleQuery(
        @Min(value = 0,message = "page는 0 이상이어야 합니다.")
        int page,
        @Min(value = 1, message = "size는 1 이상이어야 합니다.")
        int size,
        String title,
        String author,
        ArticleSort sort
) {
}
