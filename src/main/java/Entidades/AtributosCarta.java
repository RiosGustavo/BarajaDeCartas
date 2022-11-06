/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author User
 */
public class AtributosCarta {
    
    private int numeroCarta;
    private AtributosPalo palo;

    public AtributosCarta() {
    }

    public AtributosCarta(int numeroCarta, AtributosPalo palo) {
        this.numeroCarta = numeroCarta;
        this.palo = palo;
    }

    public int getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(int numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public AtributosPalo getPalo() {
        return palo;
    }

    public void setPalo(AtributosPalo palo) {
        this.palo = palo;
    }

    

    @Override
    public String toString() {
        return "{" + "numeroCarta=" + numeroCarta + ", palo=" + palo + '}';
    }
    
    
//     //AMBOS METODOS TRABAJAN JUNTOS PARA HACER VALIDACIONES CORRECTAS Y EVITAR DUPLICACIONES.
//    //DEBO DECIDIR BAJO QUE CRITERIO HAGO LA COMPARACION. 
//    @Override // Lo creo para definir que parametro utiliza para no repetir datos, en este casso DNI
//    public int hashCode() {
//       
//        return  this.getNumeroCarta().hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {//Lo creo para definir que parametro utiliza para no repetir datos,en este casso PAIS
//        
//        
//        if (obj == null) 
//            return false;
//        
//        
//         AtributosCarta other = (AtributosCarta) obj;
//        if (this.getNumeroCarta().equals(other.getNumeroCarta())) 
//            return true;
//        
//        return false;
//    
//    }
    
    
}
