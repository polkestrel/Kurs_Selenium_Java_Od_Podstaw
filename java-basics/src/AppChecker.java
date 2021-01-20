public class AppChecker {

    public static void main(String[] args) {

        IphoneApp iphoneApp = new IphoneApp("I5");
        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();

        AndroidApp androidApp = new AndroidApp("G5");
        androidApp.appInfo();
        androidApp.runAndroidApp();
    }
}
