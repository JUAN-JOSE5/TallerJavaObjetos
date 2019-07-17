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
public class Furgonetas extends Vehiculo {
    private double CapacidadDeCarga,altura;

    public Furgonetas(String Marca,String placa, double NumeroDeSerie, double KilometrosRecorridos, double CantidadDeCombustible,double CapacidadDeCarga, double altura) {
        super(Marca, placa, NumeroDeSerie, KilometrosRecorridos, CantidadDeCombustible);
        this.CapacidadDeCarga = CapacidadDeCarga;
        this.altura = altura;
    }
    public String mostrar(){
        String resultado ="";
        resultado = MostrarInfo()+"\t"+Double.toString(CapacidadDeCarga)+"\t"+Double.toString(altura);
        return resultado;
    }
    public void setCapacidadDeCarga(double CapacidadDeCarga){
        this.CapacidadDeCarga= CapacidadDeCarga;
    }
    public void setaltura(double altura){
        this.altura=altura;
    }
}
