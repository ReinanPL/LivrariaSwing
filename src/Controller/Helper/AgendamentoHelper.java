/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import Model.DAO.Banco;
import Model.DAO.MangaDAO;
import Model.Manga;
import View.AgendamentoTela;
import View.ModificarPreco;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Reinan
 */
public class AgendamentoHelper {
    
    
    AgendamentoDAO agendamento = new AgendamentoDAO();
    MangaDAO manga = new MangaDAO();

    private final AgendamentoTela view;

    public AgendamentoHelper(AgendamentoTela view) {
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
                manga.verifica(id).getAlugado()? "Sim" : "Não",
              

            });
        }

    }
    
    public Agendamento alocarFilme(){

        String cliente = view.getNomeClienteTxt().getText();
        Calendar date = Calendar.getInstance();
        String dataLocacao = date.get(Calendar.DATE) + "." + date.get(Calendar.MONTH) + "." + date.get(Calendar.YEAR);
        String dataDevolucao = view.getDevolucaoTxt().getText();
        String idString = view.getIdTxt().getText(); 
        int id = Integer.parseInt(idString);
        Manga manga = agendamento.verifica(id);
        
        Agendamento agendamento = new Agendamento(cliente, dataLocacao, dataDevolucao, manga);
        return agendamento;
        
        
        
    }
    
    
    
}
