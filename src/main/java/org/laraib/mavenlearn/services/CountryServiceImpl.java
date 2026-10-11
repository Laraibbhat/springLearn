package org.laraib.mavenlearn.services;

import org.laraib.mavenlearn.dto.CountryDto;
import org.laraib.mavenlearn.mapper.CountryMapper;
import org.laraib.mavenlearn.pojo.Country;
import org.laraib.mavenlearn.repository.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryServiceImpl implements CountryService{

    private final CountryRepository countryRepository;

    Logger logger = LoggerFactory.getLogger(CountryServiceImpl.class);

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public void addCountry(CountryDto countryDto) {

        Country country = CountryMapper.CountryDtoToCountry(countryDto);
        countryRepository.addCountry(country);


    }

    @Override
    public List<CountryDto> getAllCountries() {
        logger.info("Fetching all countries from the database");
        return countryRepository.getAllCountries().stream()
                .map(CountryMapper::CountryToCountryDto)
                .collect(Collectors.toList());
    }

    @Override
    public CountryDto getCountryById(String countryId) {
        try {
            int id = Integer.parseInt(countryId);
            Country country = countryRepository.getCountryById(id);
            if (country != null) {
                return CountryMapper.CountryToCountryDto(country);
            }
        } catch (NumberFormatException e) {
            // Handle the case where countryId is not a valid integer
            e.printStackTrace();
        }
        return null;
    }
}
