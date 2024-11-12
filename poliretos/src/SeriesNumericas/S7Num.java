package SeriesNumericas;

public class S7Num {
    
    public void g1_mostrarSecuencia(int n){
        System.out.println("Secuencia de números: S7");
        int variable = 1;
        System.out.print(variable);
    
        for(int i = 1; i < n; i++){
            variable+=3;
            System.out.print(" " + variable);   
        }
        System.out.println("");            
    }
}
