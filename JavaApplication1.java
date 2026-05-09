
package javaapplication1;


import java.util.Scanner;


public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int bakiye = 1000 , input = 0;
    
        System.out.println("merhaba bankamiza hoşgeldiniz! ");
        System.out.println("guncel bakiyeniz:"+ bakiye + "TL");
        
        while (bakiye > 0){
        System.out.println("1 => para yukle ");
        System.out.println("2 => para cek ");
        System.out.println("3 => bakiye sorgula ");
        System.out.println("4 => cikis yap ");
        System.out.print("lutfen yapmak istediginiz islemi seciniz:");
        input=scan.nextInt();
        
        if (input==1) {
                System.out.println("lutfen yuklemek istediginiz miktari giriniz:");
                int yüklenenMiktar = scan.nextInt();
                bakiye= bakiye + yüklenenMiktar;            
                System.out.println("guncel bakiyeniz: "+ bakiye +"TL" );
        }
        else if (input ==2){
              System.out.println("lutfen cekmek istediginiz miktari giriniz:");
                int çekilenMiktar=scan.nextInt();
                if (çekilenMiktar > bakiye){
                    System.out.println("yetersiz bakiye !!");
                     }else{
                    bakiye -= çekilenMiktar;
                    System.out.println("guncel bakiyeniz: "+ bakiye + "TL");
                }
        }
        else if (input == 3){
            System.out.println("guncel bakiyeniz: "+bakiye + "TL");
            
        }
        else if (input ==4){
            System.out.println("cikis isleminiz basariyla gerceklesmistir!");
            System.out.println("bankamiza tekrar bekleriz!");
            break;
        }
        else{
            System.out.println("lutfen gecerli bir islem giriniz!");
        }
    }}
    
    
}
       
    
   
         
       
       
        
        
        
      
            
    
    

