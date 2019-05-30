package br.com.fiap.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.ProdutoTO;
import br.com.fiap.beans.Unidade;

public class ProdutoBO {

	private static final ArrayList<ProdutoTO> PRODUTOS = new ArrayList<ProdutoTO>();
	
	static {
		PRODUTOS.add(new ProdutoTO(1, "clube social", 2.50, "05/2020", Unidade.GR));
		PRODUTOS.add(new ProdutoTO(2, "acai que a bruna nao trouxe", 8000, "05/2030", Unidade.KG));
		PRODUTOS.add(new ProdutoTO(-1, "Produto invalido", 0, null, null));
	}

	
	public ProdutoTO consultarProdutoPorCodigo(int codigo) {
		for (ProdutoTO produtoTO : PRODUTOS) {
			if(produtoTO.getCodigo() == codigo) {
				return produtoTO;
			}
		}
		return this.consultarProdutoPorCodigo(-1);
	}
	
	//Metodo que retorna todos os produtos
	public List<ProdutoTO> buscar(){
		return PRODUTOS;
	}
	
	//Metodo de cadastrar produto
	public void cadastrar(ProdutoTO produto) {
		PRODUTOS.add(produto);
	}
	
	//Metodo para atualizar produto
	public void atualizarProduto(ProdutoTO produto) {
		for (ProdutoTO produtoTO : PRODUTOS) {
			if(produtoTO.getCodigo() == produto.getCodigo()) {
				produtoTO.setNome(produto.getNome());
				produtoTO.setDataValidade(produto.getDataValidade());
				produtoTO.setUnidade(produto.getUnidade());
				produtoTO.setValor(produto.getValor());
			}
		}
	}
	
	
	public void deletarProduto(int codigo) {
		for (int i = 0; i < PRODUTOS.size(); i++) {
			if(codigo == PRODUTOS.get(i).getCodigo()) {
				PRODUTOS.remove(i);
			}
		}
	}
	
}
