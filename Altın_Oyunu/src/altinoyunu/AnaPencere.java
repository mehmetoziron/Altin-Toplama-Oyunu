/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altinoyunu;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Oziron
 */
public class AnaPencere extends JFrame {

    static int mGenislik;
    static int mYukseklik;
    
    public AnaPencere(int SizeX, int SizeY){
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.mGenislik = SizeX;
        this.mYukseklik = SizeY;
        SetDimension();
        //setResizable(false);
        
        Harita harita = new Harita();
        add(harita);
    }
    
    public void SetDimension()
    {
        Dimension Dim = Toolkit.getDefaultToolkit().getScreenSize();
        
        int PosX = 0;
        int PosY = 0;
        
        if(mGenislik + 100 > Dim.width)
            mGenislik = Dim.width-100;
        if(mYukseklik + 100 > Dim.height)
            mYukseklik = Dim.height-100;
        
        PosX = (Dim.width - mGenislik)/2;
        PosY = (Dim.height - mYukseklik)/2;
        
        setBounds(PosX,PosY,mGenislik+17,mYukseklik+40);
    }
}
