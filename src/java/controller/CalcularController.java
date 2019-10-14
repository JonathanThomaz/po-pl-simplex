/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Restricao;

/**
 *
 * @author admin
 */
public class CalcularController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int qtdVar = parseInt(request.getParameter("txtQtdVar"));
        int qtdRes = parseInt(request.getParameter("txtQtdRes"));
        int variaveis[] = new int[qtdVar];
        int restricoes[] = new int[qtdRes];
        for (int i=0; i<qtdVar; i++) {
             variaveis[i] = i+1; // na i-ésima posição do vetor "v" armazena o valor da variável "i"
        }
        for (int i=0; i<qtdRes; i++) {
             restricoes[i] = i+1; // na i-ésima posição do vetor "v" armazena o valor da variável "i"
        }
        
        //int variaveis[] = (int[]) request.getAttribute("variaveis");
        //int restricoes[] = (int[]) request.getAttribute("restricoes");
        for( int variavel:variaveis){
                String nome0 = "txtObjetivoX"+variavel;
                int varObjetivo =  parseInt(request.getParameter(nome0));
        }
        ArrayList<Restricao> listRestricao = new ArrayList<>();
        System.out.println("entrou");
        int qtdFolgas = 0;
        int qtdArtificiais = 0;
        for( int restricao:restricoes){
            System.out.println("entrou1for");
            Restricao r = new Restricao();
            int valorVariaveis[] = new int[qtdVar];
            int i = 0;
            for( int variavel:variaveis){
                System.out.println("entrou2for");
                String nome = "txtX"+variavel+"r"+restricao;
                System.out.println(nome);
                int var1 =  parseInt(request.getParameter(nome));
                System.out.println(var1);
            valorVariaveis[i] = var1;
            i++;
        }
            System.out.println("sai2for");
            String nome1 = "txtIgualdadeRes"+restricao;
            String nome2 = "txtResultadoRes"+restricao;
            System.out.println(nome1+"  "+nome2);
            String igualdade = request.getParameter(nome1);
            System.out.println(igualdade);
            int resultado = parseInt(request.getParameter(nome2));
            System.out.println(resultado);
            if(igualdade == "="){
                r.setArtificial(1);
                qtdArtificiais++;
            }else if(igualdade == ">="){
                r.setFolga(-1);
                r.setArtificial(1);
                qtdFolgas++;
                qtdArtificiais++;
            }else if(igualdade == "<="){
                r.setFolga(1);
                qtdFolgas++;
            }
            r.setResultado(resultado);
            
            r.setVariaveis(valorVariaveis);
            listRestricao.add(r);
        }
        
        System.out.println("saiuentrou");
        
        System.out.println(listRestricao);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
