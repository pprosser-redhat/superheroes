package io.quarkus.workshop.super_heroes.fight.client;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.validation.constraints.NotNull;

@Schema(description="The villain fighting against the hero")
public class Villain {

    @NotNull
    public String name;
    @NotNull
    public int level;
    @NotNull
    public String picture;
    public String powers;

}