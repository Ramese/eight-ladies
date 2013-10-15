/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author radek
 */
public class vektor {
    int[][] v = new int[8][8];
    
    public vektor() {
    }
    public void vynuluj(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                v[i][j] = 0;
            }
        }
    }
    public int getV(int i, int j) {
        return v[i][j];
    }

    public void setV(int i,int j) {
        this.v[i][j] = 1;
    }
    
    public int getOk(int i, int j){
        int doprava = 7 - i;
        int doleva = i;
        int dolu = 7 - j;
        int nahoru = j;
        
        for (int k = 1; k <= doprava; k++) {
            if(v[i+k][j]==1){
                return 1;
            }
            
        }
        
        for (int k = 1; k <= doleva; k++) {
            if(v[i-k][j]==1){
                return 1;
            }
            
        }
        
        for (int k = 1; k <= nahoru; k++) {
            if(v[i][j-k]==1){
                return 1;
            }
            
        }
        
        for (int k = 1; k <= dolu; k++) {
            if(v[i][j+k]==1){
                return 1;
            }
        }
        
        for (int k = 1; k <= doleva; k++) {
            for (int l = 1; l < nahoru; l++) {
                if(l==k){
                    if(v[i-k][j-l]==1){
                        return 1;
                    }
                }
            }
        }
        for (int k = 1; k <= doprava; k++) {
            for (int l = 1; l <= nahoru; l++) {
                if(l==k){
                    if(v[i+k][j-l]==1){
                        return 1;
                    }
                }
            }
        }
        for (int k = 1; k <= doleva; k++) {
            for (int l = 1; l <= dolu; l++) {
                if(l==k){
                    if(v[i-k][j+l]==1){
                        return 1;
                    }
                }
            }
        }
        for (int k = 1; k <= doprava; k++) {
            for (int l = 1; l <= dolu; l++) {
                if(l==k){
                    if(v[i+k][j+l]==1){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
    
    public void vymazRadek(int i){
        for (int j = 0; j < 8; j++) {
            v[i][j]=0;
        }
    }
    
    @Override
    public String toString(){
        String ss = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ss = ss + " " + v[i][j];
                
            }
            ss = ss + "\n";
        }
        return ss;
    }
}
