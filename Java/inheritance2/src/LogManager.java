public class LogManager {
    public void log(int logType){
        if (logType == 1){
            System.out.println("Veritabanaına Loglandı");
        }
        else if(logType == 2){
            System.out.println("Dosyaya Loglandı");
        }
        else{
            System.out.println("Email Gönderildi");
        }
    }
}
