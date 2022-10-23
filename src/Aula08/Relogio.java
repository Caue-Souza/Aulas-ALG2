package Aula08;

import java.time.LocalTime;

public class Relogio implements InterRelogio {
    private LocalTime tempo;

    public int getHoras(){
        System.out.println(tempo.getHour());
        return tempo.getHour();
    }public int getMinutos(){
        System.out.println(tempo.getMinute());
        return tempo.getMinute();
    }public int getSegundos(){
        System.out.println(tempo.getSecond());
        return tempo.getSecond();
    }public String getHoraCompleta(){
        String horaCompleta = "";
        System.out.println(getHoras() + getMinutos() + getSegundos());
        return horaCompleta;
    }

    public LocalTime getTempo() {
        return tempo;
    }

    public void setTempo(LocalTime tempo) {
        this.tempo = tempo;
    }
}
