package org.example.joyeria.vendedor.event;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.vendedor.value.AreaId;
import org.example.joyeria.vendedor.value.Nombre;

public class AreaAgregada extends DomainEvent {
    private final Nombre nombre;

    public AreaAgregada(AreaId entityId, Nombre nombre) {
        super("joyeria.area.areacreada");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}