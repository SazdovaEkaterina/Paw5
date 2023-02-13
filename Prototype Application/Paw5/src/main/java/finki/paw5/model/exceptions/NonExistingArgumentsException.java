package finki.paw5.model.exceptions;

public class NonExistingArgumentsException extends Exception{
    public NonExistingArgumentsException() {
        super("There are empty fields for arguments");
    }
}
