package week1;

import java.util.logging.Logger;

public class Main {

    private static final Logger logger = LoggerConfig.getLogger();

    public static void main(String[] args) {
        LoggerConfig.configureLogger();

        System.out.println("Informações do Sistema:");
        System.out.println("------------------------");
        System.out.println("Sistema Operacional: " + SistemaInfo.getSystemName());
        System.out.println("Versão: " + SistemaInfo.getOSVersion());
        System.out.println("Usuário: " + SistemaInfo.getUserName());
        System.out.println("Arquitetura: " + SistemaInfo.getOSArch());
        System.out.println("JVM: " + SistemaInfo.getJavaVersion());
        System.out.println("Fornecedor: " + SistemaInfo.getJavaVendor());
        System.out.println("Java Instalado em: " + SistemaInfo.getJavaHome());
        System.out.println("\nLogs gerados em sistema.log");

        // Gerando logs
        logger.info("Sistema Operacional: " + SistemaInfo.getSystemName());
        logger.info("Versão: " + SistemaInfo.getOSVersion());
        logger.info("Usuário: " + SistemaInfo.getUserName());
        logger.info("Arquitetura: " + SistemaInfo.getOSArch());
        logger.info("JVM: " + SistemaInfo.getJavaVersion());
        logger.info("Fornecedor: " + SistemaInfo.getJavaVendor());
        logger.info("Java Instalado em: " + SistemaInfo.getJavaHome());
        logger.info("Logs gerados com sucesso!\n");
    }
}
