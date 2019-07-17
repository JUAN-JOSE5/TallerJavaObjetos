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
public abstract class Vehiculo {
    protected String Marca,placa;
    protected double NumeroDeSerie,KilometrosRecorridos,CantidadDeCombustible;

    public Vehiculo(String Marca, String placa, double NumeroDeSerie, double KilometrosRecorridos, double CantidadDeCombustible) {
        this.Marca = Marca;
        this.placa = placa;
        this.NumeroDeSerie = NumeroDeSerie;
        this.KilometrosRecorridos = KilometrosRecorridos;
        this.CantidadDeCombustible = CantidadDeCombustible;
    }
    public String MostrarInfo(){
        String resultado = "";
        resultado = Marca+"\t"+placa+"\t"+Double.toString(NumeroDeSerie)+"\t"+Double.toString(KilometrosRecorridos)+"\t"+Double.toString(CantidadDeCombustible);
        return resultado;
    }
    public void SetKilometrosRecorridos(double KilometrosRecorridos){
        this.KilometrosRecorridos= KilometrosRecorridos;
    }
    public void SetCantidadDeCombustible(double CantidadDeCombustible){
        this.CantidadDeCombustible = CantidadDeCombustible;
    }
}
