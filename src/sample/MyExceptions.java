package sample;

public class MyExceptions extends Exception {

    public MyExceptions() {
        //TODO Auto-generate constructor stub
    }

    public MyExceptions(String err1Msg, String newName) {
        super(err1Msg);
        System.out.println("Woops " + newName + " is not a name!! Please try again: ");
    }

   public MyExceptions(String errMsg, int newAge) {
      super(errMsg);
      System.out.println(newAge + " is an incorrect age. Try again: ");
  }

}



/*

    public MyExceptions(String message) {
        super(message);
        //TODO Auto-generate constructor stub
    }

    public MyExceptions(Throwable cause) {
        super(cause);
        //TODO Auto-generate constructor stub
    }

    public MyExceptions(String message, Throwable cause) {
        super(message, cause);
        //TODO Auto-generate constructor stub
    }
    }
}  */

