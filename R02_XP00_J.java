/*  Rule 02. Expressions (EXP)
//      XP00J- Do not ignore values returned by methods
*/

import java.io.File;

public class R02_XP00_J {

    //Compliant code
    public void deleteFile() {
     
      File someFile = new File("someFileName.txt");
      // Do something with someFile
      if (!someFile.delete()) {
        // Handle failure to delete the file
      }
     
    }
      
}
