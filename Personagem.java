package sistemabattle;

public abstract class Personagem {

    //Atributos
    protected String nome;
    protected float forca;
    protected float defesa;
    protected float sabedoria;
    protected float hp;
    protected float ck;
    protected float stamina;
    protected String habilidade;
    protected float dano;
    protected float danoMagico;
    //ações
    public abstract void atacar();   
    public abstract void defender();
    
    //metods
    
    public void status(){
        
        System.out.println("Nome: "+this.getNome());
        System.out.println("Vida: "+this.getHp());
        System.out.println("Stamina: "+this.getStamina());
        System.out.println("CK: "+this.getCk());
        System.out.println("Sabedoria: "+this.getSabedoria());
        System.out.println("Força: "+this.getForca());
        System.out.println("Defesa: "+this.getDefesa());
    }
    //metodos getters

    public float getDanoMagico() {
        return danoMagico;
    }

    public void setDanoMagico(float danoMagico) {
        this.danoMagico = danoMagico;
    }
    
    public float getDano() {
        return dano;
    }

    public void setDano(float dano) {
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public float getForca() {
        return forca;
    }

    public void setForca(float forca) {
        this.forca = forca;
    
    }

    public float getDefesa() {
        return defesa;
    }

    public void setDefesa(float defesa) {
        this.defesa = defesa;
    }

    public float getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(float sabedoria) {
        this.sabedoria = sabedoria;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public float getCk() {
        return ck;
    }

    public void setCk(float ck) {
        this.ck = ck;
    }

    public float getStamina() {
        return stamina;
    }

    public void setStamina(float stamina) {
        this.stamina = stamina;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

}
