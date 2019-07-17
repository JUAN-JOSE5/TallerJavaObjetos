/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerjavaobjetos;

/**
 *
 * @author Juan Jose Millan Corzo
 */
public class CarroDeportivo extends Vehiculo{
    private double  CaballosDePotencia;
    private boolean turbo;
    private int NumeroDeAsientos;

    public CarroDeportivo( String Marca,String placa, double NumeroDeSerie, double KilometrosRecorridos, double CantidadDeCombustible,double CaballosDePotencia, boolean turbo, int NumeroDeAsientos) {
        super(Marca, placa, NumeroDeSerie, KilometrosRecorridos, CantidadDeCombustible);
        this.CaballosDePotencia = CaballosDePotencia;
        this.turbo = turbo;
        this.NumeroDeAsientos = NumeroDeAsientos;
    }

    public String mostrar3(){
        String resultado ="";
        resultado = MostrarInfo()+"\t"+Double.toString(CaballosDePotencia)+"\t"+turbo+"\t"+Integer.toString(NumeroDeAsientos);
        return resultado;
    }
    public void setTurbo(boolean turbo){
        this.turbo=turbo;
    }
}
