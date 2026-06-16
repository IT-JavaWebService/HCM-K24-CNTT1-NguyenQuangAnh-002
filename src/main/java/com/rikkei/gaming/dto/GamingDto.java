package com.rikkei.gaming.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.aspectj.lang.annotation.RequiredTypes;
import org.hibernate.annotations.Type;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GamingDto {
    private Long id;
    @NotBlank(message = "Ten thiet bi khong duoc de trong")
    private String product_name;
    @NotBlank(message = "Ma so seri may khong duoc de trong")
    private String seria_code;
    //truong price phai co gia tri lon hon 0
    private Double price;
    private enum type{ KEYBOARD, MOUSE_HEADSET};
    private boolean is_deleted;
}
