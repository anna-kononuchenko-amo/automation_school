package lesson8_exeptions;

import java.io.IOException;

class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class Exceptions {
    public void myHomework() {
        try {
            // read from file
            throw new IOException("Example IOException");
        } catch (IOException e) {
            // log stack trace
            e.printStackTrace();
            // re-throw custom unchecked exception
            throw new CustomUncheckedException("My oun unchecked exception", e);
        }
    }

    public static void main(String[] args) {
        Exceptions exceptions = new Exceptions();
        try {
            exceptions.myHomework();
        } catch (CustomUncheckedException e) {
            System.out.println("The exception is handled: " + e.getMessage());
        }
    }
}

