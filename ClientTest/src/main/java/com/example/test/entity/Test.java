package com.example.test.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="test")

public class Test {
@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column (name = "test_id")
private Long id;

@Column(name = "test")
    private String test;

}
