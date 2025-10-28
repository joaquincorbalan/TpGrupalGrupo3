package ar.edu.unrn.seminario.modelo;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdenDeRetiro {
    public static final int PENDIENTE = 1;
    public static final int EN_EJECUCION = 2;
    public static final int COMPLETADO = 3;
    private static int cont = 0;

    private int nOrden;
    private Date fechaEmisionOrden;
    private LocalTime horaEmisionOrden;
    private Date fechaRetiro;
    private int estado;
    private List<Voluntario> voluntarios = new ArrayList<>();
    private List<Visita> visitas = new ArrayList<>();
    private PedidoDeDonacion pedido;

    public OrdenDeRetiro(PedidoDeDonacion unpedido, Date fechaEmision, LocalTime horaEmision,
                         Date fechaRetiro, Voluntario voluntario) {
        this.pedido = unpedido;
        this.fechaEmisionOrden = fechaEmision;
        this.horaEmisionOrden = horaEmision;
        this.fechaRetiro = fechaRetiro;
        this.estado = PENDIENTE;
        this.voluntarios.add(voluntario) ;
        this.nOrden = ++cont;
    }



	public void añadirVisita(Visita xvisita) {
        if (this.estado != COMPLETADO) {
            this.visitas.add(xvisita);
            this.estado = EN_EJECUCION;
        } else {
            System.out.println("Se recolectaron todas las donaciones");
        }
    }

    public void finalizarPedido() {
        this.estado = COMPLETADO;
    }

    public void ejecutarRetiro() {
        System.out.println(this.imprimirOrdenRet());
        for (Visita visita : visitas) {
            System.out.println(visita.imprimirVisita());
        }
        this.finalizarPedido();
    }

    private String obtenerTipo() {
        switch (this.estado) {
            case PENDIENTE: return "PENDIENTE";
            case EN_EJECUCION: return "EN EJECUCIÓN";
            case COMPLETADO: return "COMPLETADO";
            default: return "DESCONOCIDO";
        }
    }

    public StringBuffer imprimirOrdenRet() {
        StringBuffer ordenRet = new StringBuffer();
        ordenRet.append("Orden de Retiro Nº " + this.nOrden + "\n");
        ordenRet.append("Fecha de emisión: " + fechaEmisionOrden + "\n");
        ordenRet.append("Hora de emisión: " + horaEmisionOrden + "\n");
        ordenRet.append("Fecha de retiro: " + fechaRetiro + "\n");
        ordenRet.append("Voluntario: " + ((Voluntario) voluntarios).obtenerNombre() + "\n");
        ordenRet.append("Estado: " + this.obtenerTipo() + "\n");
        return ordenRet;
    }
}

