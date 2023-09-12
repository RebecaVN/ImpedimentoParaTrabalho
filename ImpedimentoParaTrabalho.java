package EstruturaDeDecisaoLogica;

public class ImpedimentoParaTrabalho {
	public static void main (String [] args) {
		
	
		String nome1 = "Ana Lima";
		boolean restricaoV1 = true;
		boolean restricaoP1= false;
		boolean restricaoPB1 = false;
		boolean restricaoPA1 = true;
		
		
		String nome2 = "Laura Torres";
		boolean restricaoV2 = false;
		boolean restricaoP2 = false;
		boolean restricaoPB2 = false;
		boolean restricaoPA2 = false;
		
		
		String testenome = nome1;
		boolean teste1 = restricaoV1;
		boolean teste2 = restricaoP1;
		boolean teste3 = restricaoPB1;
		boolean teste4 = restricaoPA1;
		
		
			System.out.println("          HABILITAÇÃO DE FUNCIONÁRIO NR35");
			System.out.println(" ");
			System.out.println(testenome);
			System.out.println(" ");
		
		if (teste1 == false & teste2 == false & teste3 == false & teste4 == false){
			System.out.println("Você tem autorização!");	
		}else{
			System.out.println("Você não tem autorização!");
		}
	
		
	}

}
