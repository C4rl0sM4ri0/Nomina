/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomina;

/**
 *
 * @author Carlos Hack
 */
public class Nomina {
  
    private float numHorasTrabajadas;
    private float valHoras;

    public float getNumHorasTrabajadas() {
        return numHorasTrabajadas;
    }

    public void setNumHorasTrabajadas(float numHorasTrabajadas) {
        this.numHorasTrabajadas = numHorasTrabajadas;
    }

    public float getValHoras() {
        return valHoras;
    }

    public void setValHoras(float valHoras) {
        this.valHoras = valHoras;
    }

    //Metodos
    public float salBasic() {
        return numHorasTrabajadas * valHoras;
    }

    public float subsidio() {
        if (salBasic() < 800000) {
            return 50000;
        }
        return 0;
    }

    public float retencion() {
        if (salBasic() < 800000) {
            return (float) (salBasic() * 0.03);
        } else {
            if (salBasic() > 800000 && salBasic() < 2000000) {
                return (float) (salBasic() * 0.05);
            } else {
                return (float) (salBasic() * 0.07);
            }
        }
    }

        public float totalPagar() {
        return salBasic() + subsidio() - retencion();
    }
}
