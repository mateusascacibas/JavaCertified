package log;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Login {
    
    private static final Logger logger = Logger.getLogger(Login.class.getName());
    private final static String SENHA = "123"; 

    public static void main(String[] args) {
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("login.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setUseParentHandlers(false);

            Scanner scanner = new Scanner(System.in);            
            boolean sucesso = false;
            int count = 0;

            while (!sucesso && count < 3) { 
                count++;
                
                System.out.print("Senha: ");
                String senha = scanner.nextLine();

                if (senha.equals(SENHA)) {
                    sucesso = true;
                    logger.info("Login realizado com sucesso.");
                    System.out.println("Login bem-sucedido!");
                } else {
                    logger.warning("Tentativa " + count + " com falha.");
                    if (count == 3) {
                        logger.severe("Foram realizadas 3 tentativas incorretas. Conta bloqueada.");
                        System.out.println("Conta bloqueada. Entre em contato com o suporte.");
                    }
                }
            }
            scanner.close();
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }
}
