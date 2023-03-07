package Cuentas;

public class CCuenta {

/** Esta clase simula el funcionamiento de una cuenta bancaria a la hora de realizar transacciones 
 * @author sofia
 * @version 1
 * @since 2023
 * */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        cuenta=cue;
        saldo=sal;
    }

    
/** @return saldo actual
* Se muestra el salgo del, que en ese momento, se dispone 
* */
    public double estado()
    {
        return saldo;
    }

    
/** @exception. Aviso de error.
 * @param <0
 * @throws La cifra a ingresar no podrá ser inferior a 0 
 * */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }


/** @exception. Aviso de error.
 * @param <=0
 * @throws La cifra a retirar no podrá ser inferior a 0 
 * */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");

/** @exception. Aviso de error.
 * @param < cantidad
 * @throws No es posible retirar una cantidad superior al saldo actual  
 * */
        
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

private String getNombre() {
	return nombre;
}

private void setNombre(String nombre) {
	this.nombre = nombre;
}
}
