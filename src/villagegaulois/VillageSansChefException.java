package villagegaulois;

public class VillageSansChefException extends RuntimeException {
	public VillageSansChefException() {
		
	}
	public VillageSansChefException(String message, Throwable cause) {
		super(message, cause);
	}
	public VillageSansChefException(Throwable cause) {
		super(cause);
	}
	public VillageSansChefException(String message) {
		super(message);
	}
}
