package org.laraib.mavenlearn.controllers;

import org.laraib.mavenlearn.dto.CountryDto;
import org.laraib.mavenlearn.services.CountryService;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CountryController {

    private CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    private final Map<String, String> mockCountriesService = Map.of(
            "USA", "United States of America",
            "IND", "India",
            "CHN", "China"
    );

//    @GetMapping("/countries")
//    public ResponseEntity<CollectionModel<CountryDto>> getAllCountries () {
//        List<CountryDto> countryDtos = countryService.getAllCountries();
//
//        CollectionModel<CountryDto> collectionModel = CollectionModel.of(countryDtos);
//
//        WebMvcLinkBuilder link = WebMvcLinkBuilder.linkTo(
//                WebMvcLinkBuilder.methodOn(CountryController.class).getAllCountries());
//        collectionModel.add(link.withSelfRel());
//
//        return ResponseEntity.status(HttpStatus.OK).body(collectionModel);
//    }

    @GetMapping("/countries")
    public ResponseEntity<List<CountryDto>> getAllCountries () {
        List<CountryDto> countryDtos = countryService.getAllCountries();

//        EntityModel<List<CountryDto>> entityModel = EntityModel.of(countryDtos);

//        WebMvcLinkBuilder link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass(), getAllCountries()));
//        entityModel.add(link.withRel("all-countries"));

        return ResponseEntity.status(HttpStatus.OK).body(countryDtos);
    }

//    @GetMapping("/countries/{countryId}")
//    public ResponseEntity<CountryDto> getCountryById (@PathVariable String countryId) {
//        System.out.println("Country ID: " + countryId);
//        CountryDto countryDto = countryService.getCountryById(countryId);
//        if (countryDto != null) {
//            return ResponseEntity.status(HttpStatus.OK).body(countryDto);
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//        }
//    }

    @GetMapping("/countries/{countryId}")
    public  EntityModel<CountryDto> getCountryById (@PathVariable String countryId) {
        System.out.println("Country ID: " + countryId);
        CountryDto countryDto = countryService.getCountryById(countryId);
        System.out.println("Country DTO: " + countryDto);
        if (countryDto != null) {
            EntityModel entityModel = EntityModel.of(countryDto);
            WebMvcLinkBuilder link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getAllCountries());
            entityModel.add(link.withRel("all-countries"));
            return entityModel;
        } else {
            return null; //ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping("/country")
    public ResponseEntity<String> addCountry(@RequestBody CountryDto countryDto) {
        countryService.addCountry(countryDto);
//        Country country = CountryMapper.CountryDtoToCountry(countryDto);
        // Add logic to save the country
        return ResponseEntity.ok("Country added successfully");
    }
}
