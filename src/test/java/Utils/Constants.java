package Utils;

public class Constants {

    public static final int WAIT_TIME = 1000;

    public static final String PROPERTY_FILE_PATH = System.getProperty("user.dir")+"/src/test/resources/Config/config.properties";

    /*

     * System.getProperty("user.dir") equals C:/Users/tawhe/IdeaProjects/CucumberBatch15
     * We have put a single forward slash "/" before src, and we changed the double backslashes into single forward slashes.
       and We have them from backslashes to the forward slashes because the user.dir give us the first half of the path in forward slashes.
     * finally we have use the PROPERTY_FILE_PATH variable in ConfigReader so if in the future the path changes we will not have any problem

    * */
}
