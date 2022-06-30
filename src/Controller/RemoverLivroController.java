/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AcervoBibliotecaHelper;
import Controller.Helper.RemoverLivroHelper;
import Model.DAO.Banco;
import Model.DAO.MangaDAO;
import Model.Manga;
import View.MenuAdmin;

import View.RemoverLivro;
import java.util.ArrayList;

/**
 *
 * @author Reinan
 */
public class RemoverLivroController {
    
    private final RemoverLivro view;
    private final RemoverLivroHelper helper;

    

    public RemoverLivroController(RemoverLivro view) {
        this.view = view;
        this.helper = new RemoverLivroHelper(view);
    }
    
    public void atualizarTabela(){
        //Buscar lista com agendamentos do banco de dados
        MangaDAO mangaDAO = new MangaDAO();
        ArrayList<Manga> lista = mangaDAO.selectAll();
        
        helper.preecherTabela(lista);
    }
    
    public void deletarLivro(){
        String idString = view.getIdTxt().getText();
        int id = Integer.parseInt(idString);
        
        
        Banco.lista.remove(id);
        view.exibeMensagem("Livro removido com sucesso");
            
        }
        
    
    
    public void voltarMenu(){
        MenuAdmin menu = new MenuAdmin();
        menu.setVisible(true);
        this.view.dispose();
    }
    
}
