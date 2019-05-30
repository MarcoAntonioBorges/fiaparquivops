package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.beans.ProdutoTO;
import br.com.fiap.bo.ProdutoBO;

//serve para mapear a classe para a api
@Path("/produto")
public class ProdutoResource {
	
	private ProdutoBO bo = new ProdutoBO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProdutoTO> buscar(){
		return bo.buscar();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}") // Path em cima do metodo serve para passsar parametro
	public ProdutoTO buscarProdutoPorCodigo(@PathParam("id") int codigo) {
		return bo.consultarProdutoPorCodigo(codigo);
	}
	
	@DELETE
	@Path("/{id}")
	public void deletar(@PathParam("id") int codigo) {
		bo.deletarProduto(codigo);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(ProdutoTO produto, @Context UriInfo uriInfo) {
		bo.cadastrar(produto);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(produto.getCodigo()));
		return Response.created(builder.build()).build();
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(ProdutoTO produto, @PathParam("id") int codigo) {
		produto.setCodigo(codigo);
		bo.atualizarProduto(produto);
		return Response.ok().build();
	}
	
}
