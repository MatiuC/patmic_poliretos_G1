package SeriesNumericas;

public class S8Num {
    
    public void g1_mostrarSecuencia(int n){
        System.out.println("Secuencia de números: S8");
        int variable = 3;
        System.out.print(variable);
    
        for(int i = 1; i < n; i++){
            variable+=5;
            System.out.print(" " + variable);   
        }
        System.out.println("");            
    }
}