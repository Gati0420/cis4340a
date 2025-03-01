/*  Rule 00. Input Validation and Data Sanitization (IDS)
//    IDS03- Do not log unsanitized user input
*/

public class R00_IDS03_J {

  //Non-compliant code
  public static void main () { 

    if (loginSuccessful) {
        logger.severe("User login succeeded for: " + sanitizeUser(username));
    } else {
        logger.severe("User login failed for: " + sanitizeUser(username));
    }

  }
  
}
