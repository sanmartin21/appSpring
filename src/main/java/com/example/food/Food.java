package com.example.food;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "food", schema = "food")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;
}
