package com.example.dzdemo.controllers;

import com.example.dzdemo.dtos.WeaponDto;
import com.example.dzdemo.services.WeaponsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/weapon", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class WeaponController {

    @Autowired
    private final WeaponsService weaponsService;

    public WeaponController(WeaponsService weaponsService) {
        this.weaponsService = weaponsService;
    }

    @GetMapping(value = "/getAllWeapons")
    public List<WeaponDto> getAllWeapons() throws Exception {

        return weaponsService.getAllWeapons();
    }
}