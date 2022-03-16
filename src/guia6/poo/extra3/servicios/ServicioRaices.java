/*

• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
para que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
caso de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
package guia6.poo.extra3.servicios;

import guia6.poo.extra3.entidades.Raices;
import java.util.Scanner;

public class ServicioRaices {
    private Scanner scanner = new Scanner(System.in);
    
    public Raices crearRaices(){
        Raices raices = new Raices();
        System.out.println("ingrese coeficiente a");
        raices.setA(scanner.nextDouble());
        System.out.println("ingrese coeficiente b");
        raices.setB(scanner.nextDouble());
        System.out.println("ingrese coeficiente c");
        raices.setC(scanner.nextDouble());
        return raices;
    }
    
    /*
    • Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
    */
    public double getDiscriminante(Raices r){
       return (Math.pow(r.getB(), 2)) -4*r.getA()*r.getC();
    }
    /*
    • Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
*/
    
}
