public class BookingHotel {
    String guestName;
    String roomType;
    int nights;
    public BookingHotel(){
        this.guestName = "Suraj Sharma";
        this.roomType = "Ac";
        this.nights = 1;
    }
    public BookingHotel(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public static void main(String[] args) {
        BookingHotel hotelBooking = new BookingHotel();
        BookingHotel hotelBooking1 = new BookingHotel("Suraj Sharma", "Ac", 1);
    }
}