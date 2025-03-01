/*  Rule 02. Expressions (EXP)
//      XP00J- Do not ignore values returned by methods
*/

import java.io.File;

public class R02_XP00_J {

    //Non-compliant code
    public void deleteFile(){
 
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        someFile.delete();
       
      }
      
}