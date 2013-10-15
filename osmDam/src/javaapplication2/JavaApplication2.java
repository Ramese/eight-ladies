/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author radek
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vektor nevim = new vektor();
        double nn = 0;
        int pocet = 0;
        double nnn = Math.pow(8, 8);
        System.out.println("nnn = " + nnn);
        double proc = 0.0;
        nnn = nnn / 100.0;
        System.out.println("" + nnn);
        for (int i = 0; i < 8; i++) {
            nevim.setV(0, i);
            for (int j = 0; j < 8; j++) {
                nevim.setV(1, j);
                for (int k = 0; k < 8; k++) {
                    nevim.setV(2, k);
                    for (int l = 0; l < 8; l++) {
                        nevim.setV(3, l);
                        for (int m = 0; m < 8; m++) {
                            nevim.setV(4, m);
                            for (int n = 0; n < 8; n++) {;
                                nevim.setV(5,n);
                                for (int o = 0; o < 8; o++) {
                                    nevim.setV(6,o);
                                    for (int p = 0; p < 8; p++) {
                                        nevim.setV(7, p);
                                        //System.out.println("");
                                        //System.out.println(nevim);
                                        nn = nn + 1.0;
                                        proc = nn / nnn;
                                        
                                        if(proc%1==0){
                                            System.out.println("" + proc);
                                        }
                                        //System.out.println("nn = " + nn);
                                        //System.out.println("" + proc + " ");
                                        if(nevim.getOk(0, i)==1){
                                            nevim.vymazRadek(7);
                                            //System.out.println("nejde kvuli pozici [" + 0 + ", " + i + "]");
                                            continue;
                                        }
                                        if(nevim.getOk(1, j)==1){
                                            nevim.vymazRadek(7);
                                            //System.out.println("nejde kvuli pozici [" + 1 + ", " + j + "]");
                                            continue;
                                        }
                                        if(nevim.getOk(2, k)==1){
                                            nevim.vymazRadek(7);
                                            //System.out.println("nejde kvuli pozici [" + 2 + ", " + k + "]");
                                            continue;
                                        }
                                        if(nevim.getOk(3, l)==1){
                                            //System.out.println("nejde kvuli pozici [" + 3 + ", " + l + "]");
                                            nevim.vymazRadek(7);
                                            continue;
                                        }
                                        if(nevim.getOk(4, m)==1){
                                            //System.out.println("nejde kvuli pozici [" + 4 + ", " + m + "]");
                                            nevim.vymazRadek(7);
                                            continue;
                                        }
                                        if(nevim.getOk(5, n)==1){
                                            //System.out.println("nejde kvuli pozici [" + 5 + ", " + n + "]");
                                            nevim.vymazRadek(7);
                                            continue;
                                        }
                                        if(nevim.getOk(6, o)==1){
                                            //System.out.println("nejde kvuli pozici [" + 6 + ", " + o + "]");
                                            nevim.vymazRadek(7);
                                            continue;
                                        }
                                        if(nevim.getOk(7, p)==1){
                                            //System.out.println("nejde kvuli pozici [" + 7 + ", " + i + "]");
                                            nevim.vymazRadek(7);
                                            continue;
                                        }
                                        System.out.println("nalezeno");
                                        System.out.println(nevim);
                                        pocet = pocet + 1;
                                    }
                                    nevim.vymazRadek(6);
                                }
                                nevim.vymazRadek(5);
                            }
                            nevim.vymazRadek(4);
                        }
                        nevim.vymazRadek(3);
                    }
                    nevim.vymazRadek(2);
                }
                nevim.vymazRadek(1);
            }
            nevim.vymazRadek(0);
        }
        System.out.println("nn " + nn);
        
        nn = Math.pow(8, 8);
        System.out.println("nn " + nn);
        System.out.println("Pocet reseni " + pocet);
    }
    
}
