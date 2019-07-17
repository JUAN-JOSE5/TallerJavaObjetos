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
public class Monovolumenes extends Vehiculo {
    private int NumeroDePuertas,NumeroDeAsientos;
    private boolean PuertasLaterales,TipoDeMotor;
    private double CapacidadDeCarga;

    public Monovolumenes(String Marca, String placa, double NumeroDeSerie, double KilometrosRecorridos, double CantidadDeCombustible,int NumeroDePuertas,boolean PuertasLaterales,int NumeroDeAsientos, boolean TipoDeMotor,double CapacidadDeCarga) {
        super(Marca, placa, NumeroDeSerie, KilometrosRecorridos, CantidadDeCombustible);
        this.NumeroDePuertas = NumeroDePuertas;
        this.PuertasLaterales = PuertasLaterales;
        this.NumeroDeAsientos = NumeroDeAsientos;
        this.TipoDeMotor = TipoDeMotor;
        this.CapacidadDeCarga = CapacidadDeCarga;
    }
     public String mostrar(){
        String resultado ="";
        resultado = MostrarInfo()+"\t"+Integer.toString(NumeroDePuertas)+"\t"+PuertasLaterales +"\t"+Integer.toString(NumeroDeAsientos)+"\t"+TipoDeMotor+"\t"+Double.toString(CapacidadDeCarga);
        return resultado;
    }
     public void setPuertasLaterales(boolean PuertasLaterales){
         this. PuertasLaterales= PuertasLaterales;
     }
     public void TipoDeMotor (boolean TipoDeMotor){
         this.TipoDeMotor = TipoDeMotor;
     }
     public void CapacidadDeCarga(double CapacidadDeCarga){
         this.CapacidadDeCarga= CapacidadDeCarga;
     }
}
    

