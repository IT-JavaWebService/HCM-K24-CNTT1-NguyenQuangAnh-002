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

    @Column(name = "product_name")
    private String productName;

    @Column(name = "seria_code")
    private String seriaCode;

    private Double price;

    @Enumerated(EnumType.STRING)
    private Type type;

    @Column(name = "is_deleted")
    private boolean isDeleted = false;

    public enum Type {
        KEYBOARD, MOUSE_HEADSET
    }
}