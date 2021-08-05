

public class atuar1 {
    public  String nome;
    public  int idade;
    public boolean fazendococo;
	public int valor;

    public void aniversario(int idade){
        if (idade >= 12) {
            System.out.println("Feliz Aniversario ");
        } else {
            System.out.println("Ainda nao é seu aniversario");
        }
    }

    public boolean cocozada(boolean b){
        if (b == true ){
            System.out.println("Fazendo toto");
        } else {
            System.out.println("Nao faz toto");
        }
        return fazendococo;

    }

    public static void imprimeMatrizInt( int [][]m ) 
    { 
        
        for (int i = 0; i < m.length; i++) {
            System.out.print("\n   esta e a linha "+ (i+1) + " --> ");
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("["+ m[i][j]+"]" + " " );
            }
            System.out.println();
        }
    
    }
    
    public void incrementar(){
        valor ++;
    }
    public void decrementar(){
        valor --;
    }
    
    public void incrementar(int delta){
        this.valor= valor + delta;
    }


   


    public void setNome(String nome) {
        
        this.nome = "jorel";
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

	public Object getjorel() {
		return null;
	}



}
