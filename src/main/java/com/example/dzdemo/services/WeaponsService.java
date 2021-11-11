package com.example.dzdemo.services;

import com.example.dzdemo.dtos.WeaponDto;

import com.example.dzdemo.repositories.WeaponsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WeaponsService {
    @Autowired
    private WeaponsRepository weaponsRepository;
    @Autowired
    private final ModelMapper modelMapper;

    public WeaponsService(WeaponsRepository weaponsRepository, ModelMapper modelMapper) {
        this.weaponsRepository = weaponsRepository;
        this.modelMapper = modelMapper;
    }

    // TODO: 11.11.2021 unknown errorr

    public List<WeaponDto> getAllWeapons() {
        return weaponsRepository.findAll().stream().map(weapon -> modelMapper.map(weapon, WeaponDto.class)).collect(Collectors.toList());
    }
}
