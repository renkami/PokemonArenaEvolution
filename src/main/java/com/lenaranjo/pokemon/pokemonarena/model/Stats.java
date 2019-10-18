package com.lenaranjo.pokemon.pokemonarena.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stats
{
    private Stat stat;
    private String base_stat;
}