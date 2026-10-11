package org.laraib.mavenlearn.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryDto {

    @JsonProperty("country_code")
    private String code;

    @JsonProperty("country_name")
    private String name;

    @JsonProperty("country_id")
    private int id;

    public CountryDto() {
    }

    public CountryDto(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
