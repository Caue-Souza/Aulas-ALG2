package Aula08;

import java.time.LocalTime;

public class RadioRelogio {
    private float estacao;
    private boolean ligado;
    private LocalTime tempo;

    public float getEstacao() {
        return estacao;
    }

    public void setEstacao(float estacao) {
        this.estacao = estacao;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public LocalTime getTempo() {
        return tempo;
    }

    public void setTempo(LocalTime tempo) {
        this.tempo = tempo;
    }
}
