package com.innercircle.hhpluspushservice.interfaces.controller.health;

import com.innercircle.hhpluspushservice.interfaces.common.dto.ApiResultResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping

public class HealthCheckController {


    /**
     * healthCheck 용도
     *
     * @return ApiResultResponse 콘서트 목록을 반환한다.
     */
    @GetMapping
    public ApiResultResponse<String> getHealthCheck() {
        return ApiResultResponse.ok("Hello world!");
    }

}
