import java.util.Random;

class Personagem extends Atributos
{
    
    //ATRIBUTOS
    
    public String nome;
    public String classe; 
    public int armadura;
    public int força;
    public int velocidade; 
    public int precisão; 
    public int recuperação;
    public int energia;
    
    
    //CONSTRUTOR
    
    public Personagem ()
    {
        this.nome = ""; 
        this.classe = "Mago"; 
        this.armadura = 20; 
        this.força = 20;
        this.velocidade = 20;    
        this.recuperação = 20;
        this.precisão = 20;
        this.energia = 100;
        
        
         
    }
    
    //SETTERS 
    
    public void setNome (String nome)
    {
        this.nome = nome;
    }
    
    public void setClasse (String classe)
    {
        this.classe = classe;
    }
    
    public void setArmadura (int armadura)
    {
        this.armadura = armadura;
    }
    
    public void setForça (int força)
    {
        this.força = força; 
    }
    
    public void setVelocidade (int velocidade)
    {
        this.velocidade = velocidade;
    }
    
    public void setPrecisão (int precisão)
    {
        this.precisão = precisão;
    }
    
    public void setRecuperação (int recuperação)
    {
        this.recuperação = recuperação;
    }
    
    public void setEnergia (int energia)
    {
        this.energia = energia; 
    }
    
    //GETTERS
    
    public String getNome ()
    {
        return this.nome;
    }
    
    public String getClasse ()
    {
        return this.classe;
    }
    
    public int getArmadura ()
    {
        return this.armadura;
    }
    
    public int getForça ()
    {
        return this.força; 
    }
    
    public int getVelocidade ()
    {
        return this.velocidade;
    }
    
    public int getPrecisão ()
    {
        return this.precisão; 
    }
    
    public int getRecuperação ()
    {
        return this.recuperação;
    }
    
    public int getEnergia ()
    {
        return this.energia;
    }

    public void Ataque (Personagem inimigo)
    {
        Random rand = new Random();

        int ataque; 

        ataque = rand.nextInt(this.força) + this.precisão; 
        inimigo.energia = ataque - inimigo.defesa; 

    }

    public void recebeDano (Personagem inimigo ,int ataque)
    {
        this.defesa = ataque - defesa;

    }
    
}