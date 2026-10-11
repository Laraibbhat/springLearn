package org.laraib.mavenlearn.services;

import org.laraib.mavenlearn.dto.CountryDto;

import java.util.List;

public interface CountryService {
    void addCountry(CountryDto countryDto);

    List<CountryDto> getAllCountries();

    CountryDto getCountryById(String countryId);
}
