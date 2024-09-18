package com.innercircle.hhpluspushservice.interfaces.controller.push.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

public class PushDto {

    @Builder(toBuilder = true)
    public record Request(@NotNull Long userId) {
    }

}
