package SeriesNumericas;

public class S9Num {
    
    public void g1_mostrarSecuencia(int n){
        System.out.println("Secuencia de números: S9");
        int variable = 2;
        System.out.print(variable);
    
        for(int i = 1; i < n; i++){
            variable += Math.pow(2,i);
            System.out.print(" " + variable);   
        }
        System.out.println("");            
    }
}