
package sistemabattle;
import java.util.Random;
public class Fight  {
    //atribts
    private Personagem l1;
    private Personagem l2;
    private boolean vivo;
    private int turno;
  public void lutar(Personagem x1, Personagem x2){     
     //personagens
    l1 = x1;
    l2 = x2;    
    //nick deles
      System.out.println(l1.getNome()+" VS "+l2.getNome());      
   
    do {   
       vivo = true;
      //pra escolher oq fazer aleatoriamente(apenas teste).
      Random aleatorio = new Random();
      int lutar = aleatorio.nextInt(4);
      //pra ver se a luta deve continuar
      if(vivo == true){
            turno ++;
            
            System.out.println("INICIO DO TURNO!");
            System.out.println("Turno: "+turno);
            System.out.println("================");
      }
      //inicio do combate
      switch(lutar){ 
         
        case 0:             
              l1.atacar();
              System.out.println(l1.getNome()+": "+" ATACANDO..BANG..BANG");  
              if(l1.getDanoMagico() > l2.getDefesa()){
                 l2.setHp(l2.getHp() -(l1.getDanoMagico()-l2.getDefesa()) ); 
              }else{
                  l2.setHp(l2.getHp() -(l1.getDanoMagico()-(l2.getDefesa()-5))  );    
              }
             
              
              //status do inimigo q sofre
              System.out.println(l2.getNome()+" status ->>");
              System.out.println("Vida: "+(int)l2.getHp());
              System.out.println("Stamina: "+(int)l2.getStamina());
              
                        
              break; 
              
        case 1:                 
              l2.atacar();
              System.out.println(l2.getNome()+": "+" ATACANDO....POW..POW");
              if(l2.getDano() > l1.getDefesa() ){
                  l1.setHp(l1.getHp() - (l2.getDano()- l1.getDefesa()));
              }else{
                  l1.setHp(l1.getHp() - (l2.getDano()- (l1.getDefesa()-5)));
              }
              
              
              //statts do inimigo q sofr
              System.out.println(l1.getNome()+" status ->>"); 
              System.out.println("Vida: "+(int)l1.getHp());
              System.out.println("Stamina: "+(int)l1.getStamina());           
                
              break;
              
        case 2:            
                this.l1.atacar();
                System.out.println(this.l1.getNome()+" ~~Errou o ataque");
           
            break;            
        case 3:  
      
                this.l2.atacar();
                System.out.println(this.l2.getNome()+"~~Errou o ataque");       
            break;
      }
      
       if((this.l1.getHp()<= 0) || (this.l2.getHp()<= 0)){
                System.out.println("Fim da luta.");              
            }else{
                System.out.println("===========FIMTURNO==============");
        }
      if(l1.getHp() <= 0 || l2.getHp() <= 0){
                vivo = false;              
            }
    }while(vivo == true);
           
  }
 
 }


