/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Causin
 */
import java.awt.FlowLayout;
import java.util.Scanner;
import javax.swing.JLabel;

public class Estoque extends Login{
    public JLabel Camisa1;
    public JLabel Camisa2;
    public JLabel Camisa3;

    public JLabel getCamisa1() {
        return Camisa1;
    }

    public void setCamisa1(JLabel Camisa1) {
        this.Camisa1 = Camisa1;
    }

    public JLabel getCamisa2() {
        return Camisa2;
    }

    public void setCamisa2(JLabel Camisa2) {
        this.Camisa2 = Camisa2;
    }

    public JLabel getCamisa3() {
        return Camisa3;
    }

    public void setCamisa3(JLabel Camisa3) {
        this.Camisa3 = Camisa3;
    }
    
    public Estoque() {     
        
        setLayout(new FlowLayout());
    }
    
    
}
