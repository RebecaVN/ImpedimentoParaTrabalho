package EstruturaDeDecisaoLogica;

public class Cadastro {
	public static void main (String [] args){
		
		
		String cadastro1 = "Rogério de Lima";
		String nacionalidade1 = "Brasileiro";
		boolean aposentado1 = false;
		double renda1 = 2630.43;
		
		
		String cadastro2 = "Thais de Oliveira";
		String nacionalidade2 = "Boliviana";
		boolean aposentado2 = false;
		double renda2 = 1637.48;
		
		
		String cadastro3 = "Paloma Siqueira";
		String nacionalidade3 = "Brasileiro";
		boolean aposentado3 = true;
		double renda3 = 1212.00;
		
		
		String cadastro4 = "Teresa Silveira";
		String nacionalidade4 = "Brasileiro";
		boolean aposentado4 = false;
		double renda4 = 1900.14;
		
		
		
		String cadastro5 = "Ataíde Rocha";
		String nacionalidade5 = "Brasileiro";
		boolean aposentado5 = false;
		double renda5 = 1340.27;
		
		String testeNome  = cadastro4;
		String testeNacionalidade = nacionalidade4;
		double testeRenda = renda4;
		boolean testeAposentadoria = aposentado4;
		
		
		double salariominimo = 1212.00;
		double maximo = salariominimo * 2;	
		
		
		
			System.out.println("     CADASTRO    ");
			System.out.println(" ");
			System.out.println("NOME: " + testeNome);
		
		
		if(testeRenda < maximo & testeAposentadoria == false & testeNacionalidade == "Brasileiro"){
			System.out.println("Você tem direito");
		}else{
			System.out.println("Você não tem direito");
		}
	}

}
