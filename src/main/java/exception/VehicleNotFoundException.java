package exception;

public class VehicleNotFoundException extends RuntimeException {
    public VehicleNotFoundException(String format) {
        super(format);
    }
}
