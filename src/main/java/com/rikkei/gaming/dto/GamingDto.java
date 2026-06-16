package com.rikkei.gaming.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GamingDto {
    private Long id;

    @NotBlank(message = "Ten thiet bi khong duoc de trong")
    private String productName;

    @NotBlank(message = "Ma so seri may khong duoc de trong")
    private String seriaCode;

    @NotNull(message = "Gia thiet bi khong duoc de trong")
    @Positive(message = "truong price phai co gia tri lon hon 0")
    private Double price;

    private Type type;

    private boolean isDeleted;

    public enum Type {
        KEYBOARD, MOUSE_HEADSET
    }
}