package com.innercircle.hhpluspushservice.interfaces.controller.queue.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

public class PushDto {

    @Builder(toBuilder = true)
    public record Request(@NotNull Long reservationId) {
    }

}
