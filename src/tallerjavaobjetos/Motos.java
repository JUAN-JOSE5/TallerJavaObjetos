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
public class Motos extends Vehiculo{
    
    public Motos(String Marca,String placa, double NumeroDeSerie, double KilometrosRecorridos, double CantidadDeCombustible) {
        super(Marca, placa, NumeroDeSerie, KilometrosRecorridos, CantidadDeCombustible);
    }
     public String mostrar1(){
        String resultado="";
        resultado = MostrarInfo();
        return resultado;
    }
}
