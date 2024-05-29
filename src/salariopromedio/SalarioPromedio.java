
package salariopromedio;

import javax.swing.JOptionPane;

public class SalarioPromedio {

    public static void main(String[] args) {
        double salario[];//Declaración del arreglo de Salarios
        double sumSal=0,salarioPromedio;
        int totalEmpleados, SalarioSuperior=0; 
        
        totalEmpleados=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cantidad de empleados"));
        salario= new double[totalEmpleados];//Creación del arreglo de Salarios
        for(int i=0;i<totalEmpleados;i++) {
            salario[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese salario del empleado"));
            sumSal=sumSal+salario[i];
        }
        salarioPromedio=sumSal/totalEmpleados;
        JOptionPane.showMessageDialog(null, "El salario promedio es "+salarioPromedio);

        for(int i=0;i<totalEmpleados;i++) {
        
            if(salario[i] > salarioPromedio)
            {
                SalarioSuperior++;
            }
        }
        JOptionPane.showMessageDialog(null,"El numero de empleados con salario superior al promedio es" +SalarioSuperior); 
    }
}
