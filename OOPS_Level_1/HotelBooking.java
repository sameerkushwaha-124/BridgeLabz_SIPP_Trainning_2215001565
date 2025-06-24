// Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType,
// and nights. Use default, parameterized, and copy constructors to initialize bookings.

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    public HotelBooking(){
        this.guestName = "Sameer Kushwaha";
        this.roomType = "Ac";
        this.nights = 2;
    }
    public HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking h){
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }
    public static void main(String[] args) {
        HotelBooking hotelBooking = new HotelBooking();
        HotelBooking hotelBooking1 = new HotelBooking("Sameer Kushwaha", "Non-Ac", 3);
        HotelBooking hotelBooking2 = new HotelBooking(hotelBooking1);

        
    }
    
}
