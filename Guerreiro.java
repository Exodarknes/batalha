
package sistemabattle;

public class Guerreiro extends Personagem {           
    //atribts
    public Guerreiro() {
        this.getNome();
        this.forca = 10;
        this.defesa = 10;
        this.sabedoria = 10;
        this.hp = 100;
        this.ck = 100;
        this.stamina = 3;
    }
 
 //metods    
    @Override
    public void atacar() {
    if(this.hp > 50){
        this.setDano(this.forca = ((int)this.ck/(this.stamina)+3) - this.forca);    
    }else{
        this.setDano(this.forca = ((int)this.ck/this.stamina) -this.forca);     
        }
        System.out.println("Dano: "+(int)this.getDano());
    }
  
    @Override
    public void defender() {
    }

  
    
}
/* if(this.getHp() > 0){
          this.vivo =true;         
      }else{
          this.vivo = false;        
      }*/ 