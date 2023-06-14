package com.example;

import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.core.Response;
import org.openapitools.api.PetsApi;
import org.openapitools.model.NewPet;
import org.openapitools.model.Pet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetsApiResource implements PetsApi {

    private final Map<Integer, Pet> petMap = new HashMap<>();

    @Override
    public Response addPet(@NotNull NewPet newPet) {
        return null;
    }

    @Override
    public Response deletePet(Long id) {
        return null;
    }

    @Override
    public Response findPetById(Long id) {
        return null;
    }

    @Override
    public Response findPets(List<String> tags, Integer limit) {
        return null;
    }

}
