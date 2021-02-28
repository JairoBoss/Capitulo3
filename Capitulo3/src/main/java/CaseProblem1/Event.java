/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseProblem1;

/**
 *
 * @author jairo
 */
public class Event {
    private Integer noInvitados;  
    private Integer precio;
    private Integer precioPorInvitado;
    
    public void iniciar(){
        noInvitados = 0;       
        precio =0;
        precioPorInvitado = 0;
    }

    public Integer getNoInvitados() {
        return noInvitados;
    }

    public void setNoInvitados(Integer noInvitados) {
        this.noInvitados = noInvitados;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getPrecioPorInvitado() {
        return precioPorInvitado;
    }

    public void setPrecioPorInvitado(Integer precioPorInvitado) {
        this.precioPorInvitado = precioPorInvitado;
    }
    
    
}
