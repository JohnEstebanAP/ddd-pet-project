package org.example.joyeria.vendedor.event;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.vendedor.value.CalificacionId;
import org.example.joyeria.vendedor.value.Puntaje;

public class PuntajeDeUnaCalificacionCambiado extends DomainEvent {
    private final CalificacionId entityId;
    private final Puntaje puntaje;

    public PuntajeDeUnaCalificacionCambiado(CalificacionId entityId, Puntaje puntaje) {
        super("joyeria.calificacion.puntajedeunacalificacioncambiado");
        this.puntaje = puntaje;
        this.entityId = entityId;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }

    public CalificacionId getCalificacionId() {
        return entityId;
    }
}
