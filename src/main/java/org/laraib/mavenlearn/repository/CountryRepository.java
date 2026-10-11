package org.laraib.mavenlearn.repository;

import org.laraib.mavenlearn.pojo.Country;

import java.util.List;

public interface CountryRepository {

    void addCountry(Country country);

    List<Country> getAllCountries();

    Country getCountryById(int id);
}
