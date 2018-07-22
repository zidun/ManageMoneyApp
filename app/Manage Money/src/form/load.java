/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author zidun
 */
public class load {
    public static void main(String[] args){
        loading floadi= new loading();
        floadi.setVisible(true);
        login flogin = new login();
//        start Start = new start();
        try{
            for (int i = 0; i <= 100; i++){
                Thread.sleep(60);
                floadi.angka.setText(Integer.toString(i)+ "%");
                floadi.bar.setValue(i);
                if (i==100) {
                    floadi.setVisible(false);
                    flogin.setVisible(true);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
