package Recusion;

public class g1_crearRecursion {

    // R04: Método recursivo para obtener la potencia de `a` elevado a `b`
    public int potencia(int a, int b) {
        if (b == 0) {
            return 1; 
        }
        return a * potencia(a, b - 1);
    }

    // R05: Método recursivo para contar de 1 hasta n de forma progresiva
    public void conteoProgresivoHasta(int n) {
        if (n == 0) {
            return; 
        }
        conteoProgresivoHasta(n - 1);
        System.out.print(n+ ", ");
    }

    // R06: Método recursivo para contar de `n` hasta 0 de forma regresiva
    public void conteoRegresivo(int n) {
        if (n < 0) {
            return; 
        }
        System.out.print( n+ ", ");
        conteoRegresivo(n - 1);
    }
}
