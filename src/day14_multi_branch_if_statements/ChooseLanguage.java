package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selaction=5;
        if (selaction==1){
            System.out.println("hello, thank you for your call");
        } else if (selaction==2){
            System.out.println("hola, gracias para llamar");
        } else if (selaction==3){
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        } else if (selaction==4){
            System.out.println("privet, spasiba za vas");
        } else if (selaction==5){
            System.out.println("yahximu, nemboganti telfon kep kap seligu");
        } else {
            System.out.println("java java");
        }

    }
}
