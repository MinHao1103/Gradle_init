package com.hao.Gradle_Init.utils.httpResult;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.text.DecimalFormat;

@Data
@AllArgsConstructor
public class CommonHttpResult<T> {

    @Schema(description = "回傳代碼")
    Integer result;
    @Schema(description = "資料物件")
    T data;

}
