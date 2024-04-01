package team.gdscknu.agreeassociation.contents.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "컨텐츠", description = "컨텐츠 업로드 API")
@Slf4j
@RequiredArgsConstructor
@RestController
public class ContentsController {

    @Operation(summary = "이미지 업로드", description = "이미지 업로드")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/api/contents")
    public String uploadImage(){
        throw new UnsupportedOperationException();
    }
}
