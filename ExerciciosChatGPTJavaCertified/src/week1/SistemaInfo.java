package week1;

public class SistemaInfo {
	
	public static String getSystemName() {
		return System.getProperty("os.name");		
	}
	
	public static String getOSVersion() {
		return System.getProperty("os.version"); // Versão do SO
	}
	
	public static String getUserName() {		
		return System.getProperty("user.name"); // Nome do usuário
	}
	
	public static String getOSArch() {		
		return System.getProperty("os.arch"); // Arquitetura do processador
	}
	
	public static String getJavaVersion() {
		return System.getProperty("java.version"); // Versão da JVM
	}
	
	public static String getJavaVendor() {
		return System.getProperty("java.vendor"); // Fornecedor da JVM
	}
	
	public static String getJavaHome() {
		return System.getProperty("java.home"); // Diretório de instalação do Java
	}
	
}
