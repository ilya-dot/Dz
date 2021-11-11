package com.example.dzdemo.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@Entity
@Table(name = "weapon")
public class Weapon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column
    public String name;
    @Column
    public double rating;
    @Column
    public int sdad;

    @ManyToOne
    @JoinColumn(name="id_user")
    public User user;
}
