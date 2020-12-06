package ativi01;

public class Produto {

    private int codigo;
    private String descricao;
    private double vl_compra;
    private double custo;
    private double margem_lucro;
    private int qtdEstoque;

    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Produto(int codigo, String descricao, double vl_compra, double custo, double margem_lucro) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.vl_compra = vl_compra;
        this.custo = custo;
        this.margem_lucro = margem_lucro;
    }

    public Produto(int codigo, String descricao, double vl_compra, double custo, double margem_lucro, int qtdEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.vl_compra = vl_compra;
        this.custo = custo;
        this.margem_lucro = margem_lucro;
        this.qtdEstoque = qtdEstoque;
    }

    public void compra(int quant){
        qtdEstoque =+ quant;
    }

    public void venda(int quant){
        qtdEstoque =- quant;
    }

    public double calculaPrecoVenda(){
        return vl_compra + custo + margem_lucro * (vl_compra + custo);
    }

    public double getVl_compra() {
        return vl_compra;
    }

    public void setVl_compra(double vl_compra) {
        this.vl_compra = vl_compra;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getMargem_lucro() {
        return margem_lucro;
    }

    public void setMargem_lucro(double margem_lucro) {
        this.margem_lucro = margem_lucro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    
}