
package sistemabattle;

public class Mago extends Personagem {
   
//construtor
    public Mago() {
        this.getNome();
        this.forca = 10;
        this.defesa = 10;
        this.sabedoria = 10;
        this.hp = 101;
        this.ck = 100;
        this.stamina = 3;
    }
//Overriders
    @Override
    public void atacar() {
      if(this.hp >50){
        this.setDanoMagico(this.sabedoria = (int) (this.ck/this.stamina + 3)-this.sabedoria);
       
    }else{
        this.setDanoMagico(this.sabedoria = (int) (this.ck/this.stamina)-this.sabedoria); 
      }
      System.out.println("Dano Magico: "+(int)this.getDanoMagico());
    }

    @Override
    public void defender() {
    }

   
    
}
