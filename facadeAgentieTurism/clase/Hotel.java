package clase;

public class Hotel {
    private String numeHotel;

    public Hotel(String numeHotel) {
        this.numeHotel = numeHotel;
    }

    public void rezervaCamera(String oras){
        System.out.println("in hotelul "+this.numeHotel+"din orasul"+oras+"s a rezervat o camera");
    }
}
