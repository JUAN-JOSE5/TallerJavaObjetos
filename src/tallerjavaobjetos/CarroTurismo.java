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
public class CarroTurismo extends Vehiculo {
    private String tipo,TipoMotor;
    private int NumeroDePuertas;

    public CarroTurismo(String Marca, String placa, double NumeroDeSerie, double KilometrosRecorridos, double CantidadDeCombustible,String tipo, int NumeroDePuertas, String TipoMotor) {
        super(Marca, placa, NumeroDeSerie, KilometrosRecorridos, CantidadDeCombustible);
        this.tipo = tipo;
        this.NumeroDePuertas = NumeroDePuertas;
        this.TipoMotor = TipoMotor;
    }
    
    public String mostrar2(){
        String resultado ="";
        resultado = MostrarInfo()+"\t"+tipo+"\t"+Double.toString(NumeroDePuertas)+"\t"+TipoMotor;
        return resultado;
    }
    
    public void setTipoMotor(String TipoMotor){
        this.TipoMotor= TipoMotor;
    }
}
