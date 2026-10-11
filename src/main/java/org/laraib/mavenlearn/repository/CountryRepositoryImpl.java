package org.laraib.mavenlearn.repository;

import org.laraib.mavenlearn.mapper.CountryRowMapper;
import org.laraib.mavenlearn.pojo.Country;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryRepositoryImpl implements CountryRepository {

    private final JdbcTemplate jdbcTemplate;
    private final CountryRowMapper countryRowMapper;

    public CountryRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.countryRowMapper = new CountryRowMapper();
    }

    private static final String ADD_COUNTRY_QUERY = "INSERT INTO country (name, code) VALUES (?, ?)";
    private static final String GET_ALL_COUNTRIES_QUERY = "SELECT id, name, code FROM country";
    private static final String GET_COUNTRY_BY_ID_QUERY = "SELECT id, name, code FROM country WHERE id = ?";

    @Override
    public void addCountry(Country country) {
        // Implementation to add country to the database
        jdbcTemplate.update(ADD_COUNTRY_QUERY, country.getName(), country.getCode());
    }

    @Override
    public List<Country> getAllCountries() {
        return jdbcTemplate.query(GET_ALL_COUNTRIES_QUERY, countryRowMapper);
    }

    @Override
    public Country getCountryById(int id) {
        return jdbcTemplate.queryForObject(GET_COUNTRY_BY_ID_QUERY, countryRowMapper, id);
    }
}
