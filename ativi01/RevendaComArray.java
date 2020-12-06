package ativi01;

import java.util.ArrayList;

public class RevendaComArray {
    
    private ArrayList<Produto> produtos;
    private int indice;

    public RevendaComArray(int qtd) {
        this.produtos = new ArrayList<Produto>(qtd);
    }

    public void inserirProdutos(Produto produto){
        produtos.add(produto);
    }

    public void comprar(int codigo, int qtd){
        Boolean auxi = true;
        for(Produto prod : produtos){
            if(prod.getCodigo() == codigo){
                auxi = false;
                prod.compra(qtd);
            }
        }
        if(auxi){
            System.out.println("Error");
        }
    }

    public void vender(int codigo, int qtd){
        Boolean auxi = true;
        for(Produto prod : produtos){
            if(prod.getCodigo() == codigo){
                auxi = false;
                prod.venda(qtd);
            }
        }
        if(auxi){
            System.out.println("Error");
        }
    }

    public void consultaPrecoVenda(int codigo){
        Boolean auxi = true;
        for(Produto prod : produtos){
            if(prod.getCodigo() == codigo){
                auxi = false;
                System.out.println(prod.getCusto());
            }
        }
        if(auxi){
            System.out.println("Error");
        }
    }

    public void listaPrecos(){
        for(Produto prod : produtos){
            System.out.println(prod.getCodigo() + ", " + prod.getDescricao() + ", " + "R$ " + prod.getVl_compra());
        }
    }

    public Produto getProduto(int codigo){
        for(Produto prod : produtos){
            if(prod.getCodigo() == codigo){
                return prod;
            }
        }
        System.out.println("Error");
        return null;
    }

    

}
