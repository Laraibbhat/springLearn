package org.laraib.mavenlearn.mapper;

import org.laraib.mavenlearn.dto.CountryDto;
import org.laraib.mavenlearn.dto.CourseDto;
import org.laraib.mavenlearn.pojo.Country;
import org.laraib.mavenlearn.pojo.Course;

public class CountryMapper {

    public static CountryDto CountryToCountryDto(Country country) {
        CountryDto countryDto = new CountryDto();
        countryDto.setId(country.getId());
        countryDto.setCode(country.getCode());
        countryDto.setName(country.getName());
        return countryDto;

    }

    public static Country CountryDtoToCountry(CountryDto countryDto) {
        Country country = new Country();
        country.setId(countryDto.getId());
        country.setCode(countryDto.getCode());
        country.setName(countryDto.getName());
        return country;
    }
}
