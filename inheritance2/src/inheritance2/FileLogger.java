package inheritance2;

public class FileLogger extends Logger{
	@Override //metot override etmek -> base'deki kodu eziyor kendi kodu için *javada gerek yok ama kod okunurluğu için yaz
	public void log() {
		System.out.println("dosya loglandı");
	}

}
