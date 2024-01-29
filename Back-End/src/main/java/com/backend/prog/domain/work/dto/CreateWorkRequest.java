package com.backend.prog.domain.work.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record CreateWorkRequest(@NotNull Long projectId,
                                @NotNull Integer producerId,
                                @NotNull Integer statusCode,
                                @NotNull Integer typeCode,
                                @NotNull Integer priorityCode,
                                @NotNull Integer consumerId,
                                @NotEmpty String title,
                                String content,
                                @FutureOrPresent LocalDate startDay,
                                @Future LocalDate endDay){
}
