/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerandoCPF;

import java.util.InputMismatchException;

/**
 *
 * @author Elizangela
 */
public class GeraCPF {
    private boolean Pontos = true;
    
    private int randomizar(int n){
        int ranN = (int) (Math.random() * n);
        return ranN;
    }
    
    private int mod(int dividendo, int divisor){
        return (int) Math.round(dividendo - (Math.floor(dividendo / divisor) * divisor));
    }
    
    public String CPF(){
        int n = 9;
        
        int n1 = randomizar(n);
        int n2 = randomizar(n);
        int n3 = randomizar(n);
        int n4 = randomizar(n);
        int n5 = randomizar(n);
        int n6 = randomizar(n);
        int n7 = randomizar(n);
        int n8 = randomizar(n);
        int n9 = randomizar(n);
        
        int d1 = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;
        
        d1 = 11 - (mod(d1, 11));
        
        if (d1 >= 10){
            d1 = 0;
        }
        
        int d2 = d1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;
        
        d2 = 11 - (mod(d2, 11));
        
        String retorno = null;
        
        if (d2 >= 10){
            d2 = 0;
        }
        
        retorno = "";
        
        if (Pontos){
            retorno = "" + n1 + n2 + n3 + '.' + n4 + n5 + n6 + '.' + n7 + n8 + n9 + '-' + d1 + d2;
        } else {
            retorno = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + d1 + d2;
        }
        
        return retorno;
    }
    
    public boolean validaCPF(String CPF){
        CPF = removeCaracteresEspeciais(CPF);
        
        if (CPF.equals("11111111111") || CPF.equals("22222222222") || CPF.equals("33333333333") || 
                CPF.equals("44444444444") || CPF.equals("55555555555") || CPF.equals("66666666666") ||
                CPF.equals("77777777777") || CPF.equals("88888888888") || CPF.equals("99999999999") || 
                CPF.length() != 11){
            return false;
        }
        
        char dig10, dig11;
        
        int soma, i, recebe, n, peso;
        
        try{
            soma = 0;
            peso = 10;
            
            for (i = 0; i < 9; i++){
                n = (int) (CPF.charAt(i) - 48);
                soma = soma + (n * peso);
                peso = peso - 1;
            }
            
            recebe = 11 - (soma % 11);
            
            if ((recebe == 10) || (recebe == 11)){
                dig10 = '0';
            } else {
                dig10 = (char) (recebe + 48);
            }
            
            soma = 0;
            peso = 11;
            
            for (i = 0; i < 10; i++){
                n = (int) (CPF.charAt(i) - 48);
                soma = soma + (n * peso);
                peso = peso - 1;
            }
            
            recebe = 11 - (soma % 11);
            
            if ((recebe == 10) || (recebe == 11)){
                dig11 = '0';
            } else {
                dig11 = (char) (recebe + 48);
            }
            
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))){
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro){
            return false;
        }
    }
    
    private String removeCaracteresEspeciais(String d){
        if (d.contains(".")){
            d = d.replace(".","");
        }
        
        if (d.contains("-")){
            d = d.replace("-","");
        }
        
        return d;
    }
}
