package edu.it;

import java.util.Objects;

public class PlanteoJugada {
    public final PPT j1;
    public final PPT j2;

    public PlanteoJugada(PPT j1, PPT j2) {
        this.j1 = j1;
        this.j2 = j2;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.j1);
        hash = 89 * hash + Objects.hashCode(this.j2);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PlanteoJugada other = (PlanteoJugada) obj;
        if (this.j1 != other.j1) {
            return false;
        }
        if (this.j2 != other.j2) {
            return false;
        }
        return true;
    }
}
