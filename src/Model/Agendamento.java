/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Reinan
 */
public class Agendamento {
    
        private Manga manga;
	private String nomeCliente;
	private String dataLocacao;
	private String dataDevolucao;
        private String id;

	public Agendamento(String nomeCliente, String dataLocacao, String dataDevolucao, Manga manga) {
		
		this.nomeCliente = nomeCliente;
		this.dataLocacao = dataLocacao;
		this.dataDevolucao = dataDevolucao;
                this.manga = manga;
	} 

    public Manga getManga() {
        return manga;
    }

    public void setManga(Manga manga) {
        this.manga = manga;
    }
        
        

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(String dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
        
    
}
