package com.rikkei.gaming.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "gaming_gear")
public class GamingGear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product_name;
    private String seria_code;
    private Double price;
    private enum type{ KEYBOARD, MOUSE_HEADSET};
    private boolean is_deleted;
}
