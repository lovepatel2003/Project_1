public class main {
    public static void main(String[] args) {

        String tempURL = "https://login.salesforce.com";
        OpenGoogleChrome obj = new OpenGoogleChrome();
        obj.setChromeDriver();
        obj.openBrowser();
        obj.openURL(tempURL);
        String tempTitle = obj.getTitle();
        System.out.println(tempTitle);
    }
}
