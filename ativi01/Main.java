package ativi01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RevendaComArray revenda = new RevendaComArray(0);
        Scanner ler = new Scanner(System.in);

        while(true){

            String line = ler.nextLine();
            String[] ui = line.split(" ");
            System.out.println("$"+ line);

            if(ui[0].equals("adicionar_produto")){
                revenda.inserirProdutos(new Produto(Integer.parseInt(ui[1]), ui[2], Double.parseDouble(ui[3]), Double.parseDouble(ui[4]), Double.parseDouble(ui[5]), Integer.parseInt(ui[6])));
            }
            else if(ui[0].equals("comprar")){
                revenda.comprar(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            }else if(ui[0].equals("vender")){
                revenda.vender(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            }else if(ui[0].equals("consultar")){
                revenda.consultaPrecoVenda(Integer.parseInt(ui[1]));
            }else if(ui[0].equals("listar_preço")){
                revenda.listaPrecos();
            }else if(ui[0].equals("alterar_valor")){
                revenda.getProduto(Integer.parseInt(ui[1])).setVl_compra(Double.parseDouble(ui[2]));
            }else if(ui[0].equals("alterar custo")){
                revenda.getProduto(Integer.parseInt(ui[1])).setCusto(Double.parseDouble(ui[2]));
            }else if(ui[0].equals("alterar_margem")){
               revenda.getProduto(Integer.parseInt(ui[1])).setMargem_lucro(Double.parseDouble(ui[2]));
            }else{
                break;
            }
        }
    }
}