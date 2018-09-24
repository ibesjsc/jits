/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import configurations.LogConfig;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Luzec
 */
public class LogFile {
    protected static final Logger logger=Logger.getLogger("JITSLOG");
    public static void writeLog(String strFileName, String strMessage) throws IOException{
        FileHandler fh;  

        try {  

            // This block configure the logger with handler and formatter  
            fh = new FileHandler(strFileName,true);  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  

            // the following statement is used to log any messages  
            logger.info(strMessage);  

        } catch (SecurityException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }
    
    public static void writeLog(String strMessage) throws IOException
    {
        writeLog(LogConfig.pathFile, strMessage);
    }
}
