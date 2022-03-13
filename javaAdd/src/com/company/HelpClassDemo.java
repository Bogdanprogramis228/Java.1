/*package com.company;

public class HelpClassDemo extends Help {
    public static void main(String[] args)
        throws java.io.IOException {
            char chouice, ignor;
            Help holpg = new Help();

            for (; ; ) {
                do {
                    holpg.showmenu();

                    chouice = (char) System.in.read();

                    do {
                        ignor = (char) System.in.read();
                    } while (ignor != '\n');
                } while (!holpg.isvalid());

                if (chouice == 'q') break;
                System.out.println("\n");

                holpg.helpon(chouice);
            }
        }
}
