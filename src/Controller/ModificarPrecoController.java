/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.ModificarPrecoHelper;
import Controller.Helper.RemoverLivroHelper;
import Model.DAO.Banco;
import Model.DAO.MangaDAO;
import Model.Manga;
import View.MenuAdmin;
import View.ModificarPreco;
import View.RemoverLivro;
import java.util.ArrayList;

/**
 *
 * @author Reinan
 */
public class ModificarPrecoController {
    
    MangaDAO manga = new MangaDAO();
    
    private final ModificarPreco view;
    private final ModificarPrecoHelper helper;

    

    public ModificarPrecoController(ModificarPreco view) {
        this.view = view;
        this.helper = new ModificarPrecoHelper(view);
    }
    
    public void atualizarTabela(){
        //Buscar lista com agendamentos do banco de dados
        MangaDAO mangaDAO = new MangaDAO();
        ArrayList<Manga> lista = mangaDAO.selectAll();
        
        helper.preecherTabela(lista);
    }
    
    public void modificarLivro(){
        String idString = view.getIdTxt().getText();
        int id = Integer.parseInt(idString);
        String precoString = view.getPrecoTxt().getText();
        double preco = Double.valueOf(precoString).doubleValue();
        
        
        
        if(manga.setPreco(id, preco)== true ){
            view.exibeMensagem("Preço modificado com sucesso");
        
        }
        
    }
    
    public void voltarMenu(){
        MenuAdmin menu = new MenuAdmin();
        menu.setVisible(true);
        this.view.dispose();
    }
    
}
