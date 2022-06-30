/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AcervoBibliotecaHelper;
import Model.DAO.MangaDAO;
import Model.Manga;
import View.AcervoBiblioteca;
import View.AgendamentoTela;
import View.MenuPrincipal;
import java.util.ArrayList;

/**
 *
 * @author Reinan
 */
public class AcervoBibliotecaController {
    
    private final AcervoBiblioteca view;
    private final AcervoBibliotecaHelper helper;

    public AcervoBibliotecaController(AcervoBiblioteca view) {
        this.view = view;
        this.helper = new AcervoBibliotecaHelper(view);
    }
    
    public void atualizarTabela(){
        //Buscar lista com agendamentos do banco de dados
        MangaDAO mangaDAO = new MangaDAO();
        ArrayList<Manga> lista = mangaDAO.selectAll();
        
        helper.preecherTabela(lista);
    }
    
    public void agendamento(){
         AgendamentoTela agenda = new AgendamentoTela();
         agenda.setVisible(true);
     }
    
    public void voltar(){
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
         this.view.dispose();
    }
    
}
