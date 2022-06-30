/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Manga;
import View.AdicionarLivro;

/**
 *
 * @author Reinan
 */
public class AdicionarLivroHelper {
    
    private final AdicionarLivro view;

    public AdicionarLivroHelper(AdicionarLivro view) {
        this.view = view;
    }
    
    public static boolean lerBoolean(String resp) {

        if (resp == "Sim") {
            return true;
        }

        return false;

    }
    
    
    
    public Manga obterModelo() { 
        String idString = view.getTextId().getText(); 
        int id = Integer.parseInt(idString);
        String titulo = view.getTituloTxt().getText();
        String genero = view.getGeneroTxt().getText();
        String autor = view.getAutorTxt().getText();
        String valorString = view.getValorTxt().getText();
        double valor = Double.valueOf(valorString).doubleValue();
        String idString2 = view.getPaginaTxt().getText(); 
        int paginas = Integer.parseInt(idString2);
        String LerEsqDir = (String) view.getJComboBoxLerTrasFrente().getSelectedItem();
        String PretoBranco = (String) view.getJComboBoxPretoBranco().getSelectedItem();
     
        Manga manga = new Manga(id, titulo, genero, autor, paginas, valor, lerBoolean(PretoBranco), lerBoolean(LerEsqDir));
        return manga;
       
    }


    public void limparTela() {
     view.getTextId().setText("0");    
     view.getTituloTxt().setText(""); 
     view.getGeneroTxt().setText("");
     view.getAutorTxt().setText("");
     view.getValorTxt().setText("");
     view.getPaginaTxt().setText("");
    }
    
}
