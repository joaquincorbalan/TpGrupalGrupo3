package ar.edu.unrn.seminario.utilidades;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FechasConverter {

	//Formatos estandar
    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMATO_HORA = DateTimeFormatter.ofPattern("HH:mm");

    //Conversion String a Date
    public static Date parsearFecha(String texto) {
        LocalDate fecha = LocalDate.parse(texto, FORMATO_FECHA);
        return Date.valueOf(fecha);
    }

    //Conversion String a Time
    public static Time parsearHora(String texto) {
        LocalTime hora = LocalTime.parse(texto, FORMATO_HORA);
        return Time.valueOf(hora);
    }

    //Conversion Date a String
    public static String formatearFecha(Date fecha) {
        return fecha.toLocalDate().format(FORMATO_FECHA);
    }

    //Conversion Time a String
    public static String formatearHora(Time hora) {
        return hora.toLocalTime().format(FORMATO_HORA);
    }
}
