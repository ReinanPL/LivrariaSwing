/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendamentoHelper;
import Controller.Helper.ModificarPrecoHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import Model.DAO.Banco;
import static Model.DAO.Banco.lista;
import Model.DAO.MangaDAO;
import Model.Manga;
import View.AgendamentoTela;
import View.MenuPrincipal;
import View.ModificarPreco;
import java.util.ArrayList;

/**
 *
 * @author Reinan
 */
public class AgendamentoController {
    
    MangaDAO manga = new MangaDAO();
    AgendamentoDAO agendamento = new AgendamentoDAO();
    
    private final AgendamentoTela view;
    private final AgendamentoHelper helper;

    

    public AgendamentoController(AgendamentoTela view) {
        this.view = view;
        this.helper = new AgendamentoHelper(view);
    }
    
    public void atualizarTabela(){
        //Buscar lista com agendamentos do banco de dados
        MangaDAO mangaDAO = new MangaDAO();
        ArrayList<Manga> lista = mangaDAO.selectAll();
        
        helper.preecherTabela(lista);
    }
    
    public void alugar(){
        String idString = view.getIdTxt().getText();
        int id = Integer.parseInt(idString);
        Manga booleann = agendamento.verifica(id);
       if(id<=lista.size()) {
       if(booleann.getAlugado()==false ){
            agendamento.locarFilme(id);
            Agendamento agenda = helper.alocarFilme();
            Banco.agendamento.add(agenda);
            view.exibeMensagem("Livro alugado com sucesso");
       }else{
            view.exibeMensagem("Este Livro já foi alugado ou id errado");
           
       }
       }else{
           view.exibeMensagem("Id do livro inexistente");
           
       }
           
        
    }
    
    public void voltar(){
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
         this.view.dispose();
    }
    
}
