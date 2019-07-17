/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerjavaobjetos;

/**
 *
 * @author CBN
 */
public class Carro4X4 extends Vehiculo{
    private boolean TipoDeMotor;
    private int NumeroDeAsiento;

    public Carro4X4(String Marca, String placa, double NumeroDeSerie, double KilometrosRecorridos, double CantidadDeCombustible,boolean TipoDeMotor, int NumeroDeAsiento) {
        super(Marca, placa, NumeroDeSerie, KilometrosRecorridos, CantidadDeCombustible);
        this.TipoDeMotor = TipoDeMotor;
        this.NumeroDeAsiento = NumeroDeAsiento;
    }
     public String mostrar(){
        String resultado="";
        resultado = MostrarInfo()+"\t"+TipoDeMotor+"\t"+Integer.toString(NumeroDeAsiento);
        return resultado;
    }
     private void setTipoDeMotor4x4(boolean TipoDeMotor){
         this.TipoDeMotor =TipoDeMotor;
     }
}
