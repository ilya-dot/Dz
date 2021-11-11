package com.example.dzdemo.dtos;

import com.example.dzdemo.models.User;
import lombok.Data;

@Data
public class WeaponDto {
    public int id;
    public String name;
    public double rating;
    public User userName;
}
