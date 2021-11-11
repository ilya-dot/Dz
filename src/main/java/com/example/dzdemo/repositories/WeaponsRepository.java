package com.example.dzdemo.repositories;

import com.example.dzdemo.models.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeaponsRepository extends JpaRepository<Weapon, Integer> {
}
