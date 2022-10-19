/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODULO_INICIAL;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

/**
 *
 * @author Alann Kelly
 */
public class CriaMenu {
    // Declara componentes
    JLabel texto;
 
    // Cria o menu completo
    public JMenuBar criaMenu()
    {
        // Declara componentes do menu genericamente
        JMenuBar barraMenu;
        JMenu menu;
        JMenu submenu;
        JMenuItem menuItem;
 
        // Cria barra do Menu
        barraMenu = new JMenuBar();
 
        // Cria menu
        menu = new JMenu("Menu 1");
 
        // Adiciona menu a barra
        barraMenu.add(menu);
 
        // Cria item do menu
        menuItem = new JMenuItem("Item do Menu 1", KeyEvent.VK_I);
 
        // Cria evento do item
        menuItem.addActionListener(new ActionListener()
        {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: 1 do menu 1");
 
            }
        });
 
        // Adiciona item ao Menu
        menu.add(menuItem);
 
        // Repete processo para o segundo item
        menuItem = new JMenuItem("Item do Menu 2", KeyEvent.VK_T);
        menuItem.addActionListener(new ActionListener()
        {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: 2 do menu 1");
 
            }
        });
 
        menu.add(menuItem);
 
        // Repete processo para o terceiro item
        menuItem = new JMenuItem("Item do Menu 3", KeyEvent.VK_E);
        menuItem.addActionListener(new ActionListener()
        {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: 3 do menu 1");
 
            }
        });
        menu.add(menuItem);
 
        // Adiciona um separador de menu
        menu.addSeparator();
 
        // Repete processo para o quarto item
        menuItem = new JMenuItem("Item do Menu 4", KeyEvent.VK_M);
        menuItem.addActionListener(new ActionListener()
        {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: 4 do menu 1");
 
            }
        });
        menu.add(menuItem);
 
        // SubMenu
        // para criar um submenu cria-se um novo menu.
        // e adiciona um item 
 
        // Cria um submenu (novo menu)
        submenu = new JMenu("Item com Submenu");
 
        // Cria um item e seu evento
        menuItem = new JMenuItem("Item do Submenu", KeyEvent.VK_U);
        menuItem.addActionListener(new ActionListener()
        {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: 1 do sub menu");
 
            }
        });
 
        // Adiciona item ao submenu
        submenu.add(menuItem);
 
        // Adiciona submenu ao menu
        menu.add(submenu);
 
        // Cria um segundo menu
        menu = new JMenu("Menu 2");
 
        // Cria item para o segundo menu e seu evento
        menuItem = new JMenuItem("Item do menu 2", KeyEvent.VK_D);
        menuItem.addActionListener(new ActionListener()
        {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: 1 do menu 2");
 
            }
        });
 
        // Adiciona item ao menu
        menu.add(menuItem);
 
        // Adiciona menu a barra de menus
        barraMenu.add(menu);
 
        // retorna menu completo
        return barraMenu;
 
    }
 
    // Cria um painel
    public Container criaPainel()
    {
        // Cria painel e suas propriedades
        JPanel painel = new JPanel(new BorderLayout());
        painel.setOpaque(true);
 
        // Cria um componente de texto
        texto = new JLabel("Você cliquou no item:");
 
        // Adiciona componente ao painel
        painel.add(texto, BorderLayout.PAGE_END);
 
        /// Retorna Painel
        return painel;
    }
 
    // Cria GUI
    public static void criaGUI()
    {
        // Cria formulario e suas propriedades
        JFrame formulario = new JFrame("Desenvolvimento Aberto");
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Cria Menu
        CriaMenu menu = new CriaMenu();
 
        // Adiciona barra de menus na GUI
        formulario.setJMenuBar(menu.criaMenu());
 
        // Adiciona painel na GUI
        formulario.setContentPane(menu.criaPainel());
 
        // Adiciona propriedades ao formulario
        formulario.setSize(400, 300);
        formulario.setVisible(true);        
 
    }
 
    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run()
            {
 
                // Monta GUI
                criaGUI();
            }
        });
 
    }
 
}
