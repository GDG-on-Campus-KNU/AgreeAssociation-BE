package team.gdscknu.agreeassociation.article.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import team.gdscknu.agreeassociation.article.dto.ArticleDetailModel;
import team.gdscknu.agreeassociation.article.dto.ArticleFightModel;
import team.gdscknu.agreeassociation.article.dto.ArticleModel;
import team.gdscknu.agreeassociation.article.dto.request.ArticleCreateRequest;
import team.gdscknu.agreeassociation.article.dto.request.ArticleQuery;
import team.gdscknu.agreeassociation.article.dto.request.ArticleUpdateRequest;
import team.gdscknu.agreeassociation.core.dto.response.PagingResponse;


@Slf4j
@Tag(name = "게시글", description = "게시글 관련 API")
@RequiredArgsConstructor
@RestController
public class ArticleController {

    @Operation(summary = "게시글 페이징 조회", description = "게시글 페이징 데이터 조회")
    @GetMapping("/api/articles")
    public PagingResponse<ArticleModel> pagingArticles(@RequestParam @Valid ArticleQuery query){
        throw new UnsupportedOperationException();
    }

    @Operation(summary = "투기장 게시글 페이징 조회", description = "게시글 페이징 데이터 조회")
    @GetMapping("/api/articles/fight")
    public PagingResponse<ArticleFightModel> pagingArticleFights(@RequestParam @Valid ArticleQuery query){
        throw new UnsupportedOperationException();
    }

    @Operation(summary = "게시글 상세 조회", description = "게시글 상세 데이터 조회")
    @GetMapping("/api/articles/{id}")
    public ArticleDetailModel getArticle(@PathVariable Long id){
        throw new UnsupportedOperationException();
    }


    @Operation(summary = "게시글 인정", description = "인정버튼 클릭 후, 게시글 인정 수 반환")
    @PostMapping("/api/articles/{id}/agree")
    public Long agreeArticle(@PathVariable Long id){
        throw new UnsupportedOperationException();
    }

    @Operation(summary = "게시글 노인정", description = "노인정 버튼 클릭 후, 게시글 노인정 수 반환")
    @PostMapping("/api/articles/{id}/disagree")
    public Long disagreeArticle(@PathVariable Long id){
        throw new UnsupportedOperationException();
    }


    @Operation(summary = "게시글 작성", description = "게시글 작성 성공시 게시글 ID 반환")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/api/articles")
    public Long createArticle(@RequestBody @Valid ArticleCreateRequest request){
        throw new UnsupportedOperationException();
    }

    @Operation(summary = "게시글 수정", description = "게시글 수정")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/api/articles/{id}")
    public void updateArticle(@PathVariable Long id, @RequestBody @Valid ArticleUpdateRequest request){
        throw new UnsupportedOperationException();
    }

    @Operation(summary = "게시글 삭제", description = "게시글 삭제")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/api/articles/{id}")
    public void deleteArticle(@PathVariable Long id){
        throw new UnsupportedOperationException();
    }

}
