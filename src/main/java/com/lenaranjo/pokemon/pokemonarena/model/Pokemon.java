package com.lenaranjo.pokemon.pokemonarena.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lenaranjo.pokemon.pokemonarena.model.Types;
import com.lenaranjo.pokemon.pokemonarena.model.Stats;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon implements Comparable<Pokemon> {
	private int id;
	private String name;
	private String url;
	private Sprites sprites;
	private String weight;
	private String height;
	private List<Types> types;
	private List<Stats> stats;

	@Override
	public int compareTo(Pokemon o) {
		return this.id - o.getId();
	}

	public final void setIdFromUrl() {
		String[] parts = url.split("/");
		this.id = Integer.parseInt(parts[parts.length - 1]);
	}
}
