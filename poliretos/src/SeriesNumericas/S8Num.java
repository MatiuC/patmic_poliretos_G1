package SeriesNumericas;

public class S8Num {
    
    public void mostrarSecuencia(int n){
        int variable = 3;
        System.out.print(variable);
    
        for(int i = 1; i < n; i++){
            variable+=5;
            System.out.print(" " + variable);   
        }
        System.out.println("");            
    }
}