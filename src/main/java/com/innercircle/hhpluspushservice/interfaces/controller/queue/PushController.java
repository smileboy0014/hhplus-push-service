package com.innercircle.hhpluspushservice.interfaces.controller.queue;

import com.innercircle.hhpluspushservice.interfaces.common.dto.ApiResultResponse;
import com.innercircle.hhpluspushservice.interfaces.controller.queue.dto.PushDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/kakao")
@Slf4j
public class PushController {

    /**
     * 대기열 활성여부 조회
     *
     * @param request userId 정보
     * @return ApiResultResponse 토큰 정보와 대기열 정보를 반환한다.
     */
    @PostMapping("/push")
    public ApiResultResponse<String> checkWaiting(@RequestBody @Valid PushDto.Request request) {
        log.info("[PUSH] KAKAO push ID is %d".formatted(request.reservationId()));
        return ApiResultResponse.ok("complete push!!!!");
    }
}
