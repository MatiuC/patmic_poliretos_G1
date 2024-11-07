package SeriesNumericas;

public class S9Num {
    
    public void g1_mostrarSecuencia(int n){
        int variable = 2;
        System.out.print(variable);
    
        for(int i = 1; i < n; i++){
            variable += Math.pow(2,i);
            System.out.print(" " + variable);   
        }
        System.out.println("");            
    }
}