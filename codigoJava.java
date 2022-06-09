import java.util.Scanner;
import java.util.Random; 

class Partida 
{
    static Scanner scanf = new Scanner(System.in);
    static Random  rand  = new Random();

    static Personagem jogador = new Personagem(); 
    static Personagem inimigo = new Personagem(); 

    public static void main(String[] args)
    {
    	Introducao();
    	telaPersonagem();
    	chamaTurno();
    	jogadorTurno();
    	cpuTurno();
    	vitoria();

    }

    public static void Introducao ()
    {
    	System.out.println("DIGITE O NOME DO PERSONAGEM "); 
    	jogador.setNome("LEGOLAS"); 
    	inimigo.setNome("SMIGOL"); 
    	
    }

    public static void telaPersonagem() // MOSTRA A TELA COM INFORMAÇÕES DOS PERSONAGENS 
    {
    	System.out.println("NOME: " + jogador.getNome() + "					    NOME:" + inimigo.getNome());
		System.out.println("CLASSE: " + jogador.getClass() + "				CLASSE: "  + inimigo.getClasse());
		System.out.println("ARMADURA: " + jogador.getArmadura() + "					ARMADURA: "  + inimigo.getArmadura());
		System.out.println("FORÇA: " + jogador.getForça() + "					FORÇA: "  + inimigo.getForça());
		System.out.println("VELOCIDADE: " + jogador.getVelocidade() + "					VELOCIDADE: "  + inimigo.getVelocidade());
		System.out.println("PRECISÃO: " + jogador.getPrecisão() + "					PRECISÃO: "  + inimigo.getPrecisão());
		System.out.println("RECUPERAÇÃO: " + jogador.getRecuperação() + "					RECUPERAÇÃO: "  + inimigo.getRecuperação());
		System.out.println("ENERGIA: " + jogador.getEnergia() + "					ENERGIA: "  + inimigo.getEnergia());

    }

    public static void chamaTurno() 
    {

    	int jogadorAgi; 
    	int cpuAgi; 

    	do
    	{

    	jogadorAgi = rand.nextInt(1) + jogador.getVelocidade(); 
    	cpuAgi = rand.nextInt(1) + inimigo.getVelocidade(); 

    		if(jogadorAgi > cpuAgi)
    		{
    			jogadorTurno(); 

    		} else
    		{


    		}

    	} while(jogadorAgi != cpuAgi);

    }

    public static void jogadorTurno()
    {
    	int acao; 

    	do
    	{

    		System.out.println("SEU TURNO"); 
    		System.out.println(""); 
    		System.out.println("Escolha uma opção"); 
    		System.out.println("1 - Ataque curto"); 
    		System.out.println("2 - Ataque longo"); 
    		acao = scanf.nextInt(); 

    		switch(acao)
    		{
    			case 1 : 
    				jogador.Ataque(inimigo);
    				System.out.println("Ataque realizado com sucesso"); 
                    telaPersonagem();
    				chamaTurno(); 
    				break; 

    			default : 
    				System.out.println("Digite um comando valido"); 
    		}	

    	} while(jogador.healthPoints != 0 || jogador.healthPoints < 0); 

    }

    public static void cpuTurno()
    {
    	int acao; 

    	acao = rand.nextInt(1) + 3;

    	

    	do
    	{
			
    		System.out.println("TURNO INIMIGO"); 
    		System.out.println(""); 
    		System.out.println("Escolha uma opção"); 
    		System.out.println("1 - Defesa curta"); 
    		System.out.println("2 - Defesa longa");

    		switch (acao)
    		{
    			case 1:
    				inimigo.Ataque(jogador); 
    				System.out.println("Você e atacado com sucesso"); 
    				chamaTurno();
    				break;

    			case 2: 
    				inimigo.Ataque(jogador); 
    				System.out.println("Você e atacado com sucesso"); 
    				chamaTurno(); 
    				break;

    			case 3:
    				inimigo.Ataque(jogador); 
    				System.out.println("Você e atacado com sucesso");  
    				break;
    		}
    	} while(inimigo.healthPoints != 0 || inimigo.healthPoints <= 0);

    }

    public static void vitoria()
    {
    	if(jogador.healthPoints == 0)
    	{
    		System.out.println("voce perdeu!");
    	}

    	if(inimigo.healthPoints == 0)
    	{
    		System.out.println("voce venceu!");
    	}
    }
    
}
//Professor tive muita dificuldade nesse trabalho, porem fiz o que estava no meu alcance :(
//Uma luta de um player contra a cpu com interação com o console