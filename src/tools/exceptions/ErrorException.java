package tools.exceptions;

public class ErrorException extends Exception {

    private String message;

    public ErrorException( String message ) {
        this.message = message;
        //TODO tutaj musze jakoś wyświetlić błąd
    }

    public void HandleException() {
        //TODO zrobić wyskakujące okienko
    }
}
