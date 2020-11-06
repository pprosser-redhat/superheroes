package io.quarkus.workshop.super_heroes.fight;

import io.quarkus.workshop.super_heroes.fight.client.Hero;
import io.quarkus.workshop.super_heroes.fight.client.Villain;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.validation.constraints.NotNull;

@Schema(description="A fight between one hero and one villain")
public class Fighters {

    @NotNull
    public Hero hero;
    @NotNull
    public Villain villain;

}