/*package com.company;

public class Help {
    void helpon(int what) {

        switch (what) {
            case '1' :
                System.out.print("Инcтpyкция if: \n ");
                System.out.println("if(ycлoвиe) инструкция;");
                System.out.println("else инструкция;");
                break;
            case '2' :
                System.out.print(" Ин c т pyкци я s w i t ch : \n ");
                System.out.println(" s w i t ch ( выpaжe ниe ) { ");
                System.out.println(" c a s e конст а н т а : ");
                System.out.println(" п о следов а т е л ь н о с т ь и н с трукций ");
                System.out.println(" b r e a k ; ");
                System.out.println(" / / . . . ");
                System.out.println(" ) ");
                break;
            case '3' :
                System.out.print(" Ци кл f or : \n ");
                System.out.print(" fo r ( инициaлизaци я ; условие ; и т е р ация ) ");
                System.out.println(" и н с т рукция ; ");
                break;
            case '4' :
                System.out.print(" Ци кл wh i l e : \n ");
                System.out.println(" wh i l e ( ycлoвиe ) и н с трукци я ; ");
                break;
            case '5' :
                System.out.print(" Ци кл do-wh i l e : \n ");
                System.out.println(" do { ");
                System.out.println(" инс трукция ; ");
                System.out.println(" ) wh i l e ( услови е ; ");
                break;
            case '6' :
                System.out.print(" Ин cтpyкция break : \n ");
                System.out.println(" b r e a k ; или break метка ; ");
                break;
            case '7' :
                System.out.print(" Инcтpyкция cont inue : \n ");
                System.out.println(" cont i nue ; или cont inue ме тка ; ");
                break;
        }
        System.out.println();
    }

        void showmenu() {
            System.out.println(" Cпpaв кa : ");
            System.out.println("1. i f ");
            System.out.println("2. s w i t c h ");
            System.out.println("3. f o r ");
            System.out.println("4. whi l e ");
            System.out.println("5. do-whi l e ");
            System.out.println("6. break");
            System.out.println("7. cont inue \n ");
            System.out.println("( q - выход ) Вибери: ");
        }

        boolean isvalid(int ch) {
            if (ch < '1' | ch > '7' & ch != 'q')
                return false;
             else return true;
        }

}