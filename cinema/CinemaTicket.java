
class CinemaTicket {
    private SeatType seatType;
    private Showtime showtime;
    private double basePrice;
    private static int ticketCounter = 0;
   
    public CinemaTicket(SeatType seatType, Showtime showtime, double basePrice) {
        this.seatType = seatType;
        this.showtime = showtime;
        this.basePrice = basePrice;
        ticketCounter++;
    }
public SeatType getSeatType(){return seatType;}
 public Showtime getShowtime(){return showtime ;}
 public double getBasePrice(){return basePrice;}
public static int getTicketCounter(){return ticketCounter;}


public double calculatePrice(){
    double finalPrice= basePrice ;
    switch(seatType){
        case PREMIUM:finalPrice += 20; break;
        case VIP: finalPrice += 40; break;
        case STANDARD : default : finalPrice +=0; break;
    }
    switch (showtimeN) {
        case EVENING : finalPrice += 15; break;
        case LATE : finalPrice +=10; break;    
        case DAY : default : finalPrice +=0; break;
        
    }
    return finalPrice;

}
public String getDescription (){
    return "Bilet detayi : [Koltuk :"+ seatType +", Seans :"+ showtime +", Fiyat :"+ calculatePrice() +"]";
}


}
