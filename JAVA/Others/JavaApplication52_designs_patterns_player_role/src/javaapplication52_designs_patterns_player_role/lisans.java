/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52_designs_patterns_player_role;

/**
 *
 * @author Utilisateur
 */
public class lisans extends seviye {    // seviye abstract bir interface oldugu icin seviyeyi extends etti isem onun icindeki fonksiyonu kullanmak zorundayim.
    public boolean mezuniyet(double not){
        if(not>2) return true;
        return false;
    }
    
}
