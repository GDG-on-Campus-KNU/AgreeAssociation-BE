package team.gdscknu.agreeassociation.article.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import team.gdscknu.agreeassociation.article.dto.ArticleCommentModel;
import team.gdscknu.agreeassociation.article.dto.request.ArticleCommentCreateRequest;
import team.gdscknu.agreeassociation.core.dto.request.PagingQuery;
import team.gdscknu.agreeassociation.core.dto.response.PagingResponse;

@Slf4j
@Tag(name = "게시글 댓글", description = "게시글 댓글 관련 API")
@RequiredArgsConstructor
@RestController
public class ArticleCommentController {

    @Operation(summary = "게시글 댓글 페이징 조회", description = "게시글 댓글 페이징 데이터 조회")
    @GetMapping("/api/articles/{articleId}/comments")
    public PagingResponse<ArticleCommentModel> pagingArticleComments(@RequestParam @Valid PagingQuery query){
        throw new UnsupportedOperationException();
    }

    @Operation(summary = "게시글 댓글 작성", description = "게시글 댓글 작성 성공시 댓글 ID 반환")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/api/articles/{articleId}/comments")
    public Long createArticleComment(@RequestBody @Valid ArticleCommentCreateRequest request){
        throw new UnsupportedOperationException();
    }

    @Operation(summary ="댓글 인정", description = "댓글 인정 갯수 반환")
    @PostMapping("/api/articles/{articleId}/comments/{commentId}/agree")
    public Long likeArticleComment(@PathVariable Long articleId, @PathVariable Long commentId){
        throw new UnsupportedOperationException();
    }

    @Operation(summary = "댓글 노인정", description = "댓글 싫어요")
    @PostMapping("/api/articles/{articleId}/comments/{commentId}/disagree")
    public Long dislikeArticleComment(@PathVariable Long articleId, @PathVariable Long commentId){
        throw new UnsupportedOperationException();
    }

    @Operation(summary = "게시글 댓글 삭제", description = "게시글 댓글 삭제")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PostMapping("/api/articles/{articleId}/comments/{commentId}")
    public void deleteArticleComment(){
        throw new UnsupportedOperationException();
    }
}
