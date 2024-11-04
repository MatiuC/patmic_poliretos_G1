package SeriesNumericas;

public class S7Num {
    
    public void mostrarSecuencia(int n){
        int variable = 1;
        System.out.print(variable);
    
        for(int i = 1; i < n; i++){
            variable+=3;
            System.out.print(" " + variable);   
        }
        System.out.println("");            
    }
}
