package psv;


public class CarroBean {
    
    private String cor;
    private String descricao;
    private String placa;
    
    //Para fazer isso de forma rápida, só pressionar "alt+inser"
    // e depois é somente clicar no "Getter e setter", e pronto
      public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
       
    
}
