/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.DAO.MangaDAO;
import Model.Manga;
import View.ModificarPreco;
import View.RemoverLivro;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Reinan
 */
public class ModificarPrecoHelper {
 
    MangaDAO manga = new MangaDAO();

    private final ModificarPreco view;

    public ModificarPrecoHelper(ModificarPreco view) {
        this.view = view;
    }

    public void preecherTabela(ArrayList<Manga> lista) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTabelLivros().getModel();
        tableModel.setNumRows(0);
        String idString = view.getIdTxt().getText();
        int id = Integer.parseInt(idString);

        //percorrer a lista preenchendo o tableModel
        if (manga.verifica(id) != null) {
            tableModel.addRow(new Object[]{
                manga.verifica(id).getId(),
                manga.verifica(id).getNome(),
                manga.verifica(id).getGenero(),
                manga.verifica(id).getAutor(),
                manga.verifica(id).getPreco(),
                manga.verifica(id).getPaginas(),
              

            });
        }

    }
    
   
}